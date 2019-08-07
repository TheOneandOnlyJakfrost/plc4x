//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//

[discriminatedType 'DF1Symbol'
    [const            uint 8       'messageStart' '0x10']
    [discriminator    uint 8       'symbolType']
    [typeSwitch 'symbolType'
        ['0x02' DF1SymbolMessageFrame
            [field    uint 8       'destinationAddress']
            [field    uint 8       'sourceAddress']
            [field    DF1Command   'command']
            [const    uint 8       'messageEnd' '0x10']
            [const    uint 8       'endTransaction' '0x03']
            [implicit uint 16      'crc' 'STATIC_CALL("org.apache.plc4x.java.df1.util.DF1Utils.CRCCheck", value)']
        ]
        ['0x06' DF1SymbolMessageFrameACK
        ]
        ['0x15' DF1SymbolMessageFrameNAK
        ]
    ]
]

[discriminatedType 'DF1Command'
    [discriminator uint 8  'commandCode']
    [field    uint 8       'status']
    [field    uint 16      'transactionCounter']
    [typeSwitch 'commandCode'
        ['0x01' DF1UnprotectedReadRequest
            [field uint 16    'address']
            [field uint 8     'size']
        ]
        ['0x41' DF1UnprotectedReadResponse
            [arrayField uint 8 'data' terminated 'STATIC_CALL("org.apache.plc4x.java.df1.util.DF1Utils.dataTerminate", io)']
        ]
    ]
]
