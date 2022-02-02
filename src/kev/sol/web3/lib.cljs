(ns kev.sol.web3.lib)

(def Struct
 {"constructor"  "method - `Struct_constructor`" ,
  "encode"  "method - `Struct_encode`" ,
  "decode"  "method - `Struct_decode`" ,
  "decodeUnchecked"  "method - `Struct_decodeUnchecked`" })

(defn Struct_constructor "
properties - `any`


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Struct)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn Struct_encode "


-@return -`Buffer`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "encode" ) this) args))

(defn Struct_decode "
data - `Buffer`<>


-@return -`any`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Struct
       -decode)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Struct))
    args))

(defn Struct_decodeUnchecked "
data - `Buffer`<>


-@return -`any`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Struct
       -decodeUnchecked)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Struct))
    args))

(def Enum
 {"enum"  " `string`" , "constructor"  "method - `Enum_constructor`" })

(defn Enum_-enum ""  [this] (cljs.core/aget this "enum" ))

(defn Enum_constructor "
properties - `any`


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Enum)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(def PublicKeyInitData
 "`number`|`string`|`Buffer`<>|`Uint8Array`<>|`Array`<`number`>|`PublicKeyData`<>" )

(def PublicKeyData {})

(def PublicKey
 {"toBuffer"  "method - `PublicKey_toBuffer`" ,
  "createWithSeed"  "method - `PublicKey_createWithSeed`" ,
  "findProgramAddress"  "method - `PublicKey_findProgramAddress`" ,
  "toString"  "method - `PublicKey_toString`" ,
  "toBase58"  "method - `PublicKey_toBase58`" ,
  "isOnCurve"  "method - `PublicKey_isOnCurve`" ,
  "toBytes"  "method - `PublicKey_toBytes`" ,
  "createProgramAddress"  "method - `PublicKey_createProgramAddress`" ,
  "default"  "*
     * Default public key value. (All zeros)
      `PublicKey`<>" ,
  "equals"  "method - `PublicKey_equals`" ,
  "constructor"  "method - `PublicKey_constructor`" ,
  "toJSON"  "method - `PublicKey_toJSON`" })

(defn PublicKey_constructor "*
     * Create a new PublicKey object
     * -@param value ed25519 public key as buffer or base-58 encoded string
     
value - `PublicKeyInitData`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -PublicKey)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(cljs.core/comment "can only make function currently!!" )

(defn PublicKey_equals "*
     * Checks if two publicKeys are equal
     
publicKey - `PublicKey`<>


-@return -`bool`"
  [this & args]
  (apply (.bind (cljs.core/aget this "equals" ) this) args))

(defn PublicKey_toBase58 "*
     * Return the base-58 representation of the public key
     


-@return -`string`"
  [this & args]
  (apply (.bind (cljs.core/aget this "toBase58" ) this) args))

(defn PublicKey_toJSON "


-@return -`string`"
  [this & args]
  (apply (.bind (cljs.core/aget this "toJSON" ) this) args))

(defn PublicKey_toBytes "*
     * Return the byte array representation of the public key
     


-@return -`Uint8Array`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "toBytes" ) this) args))

(defn PublicKey_toBuffer "*
     * Return the Buffer representation of the public key
     


-@return -`Buffer`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "toBuffer" ) this) args))

(defn PublicKey_toString "*
     * Return the base-58 representation of the public key
     


-@return -`string`"
  [this & args]
  (apply (.bind (cljs.core/aget this "toString" ) this) args))

(defn PublicKey_createWithSeed "*
     * Derive a public key from another key, a seed, and a program ID.
     * The program ID will also serve as the owner of the public key, giving
     * it permission to write data to the account.
     
fromPublicKey - `PublicKey`<>
seed - `string`
programId - `PublicKey`<>


-@return -`Promise`<`PublicKey`<>>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey
       -createWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey))
    args))

(defn PublicKey_createProgramAddress "*
     * Derive a program address from seeds and a program ID.
     
seeds - `Array`<`Buffer`<>|`Uint8Array`<>>
programId - `PublicKey`<>


-@return -`Promise`<`PublicKey`<>>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey
       -createProgramAddress)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey))
    args))

(defn PublicKey_findProgramAddress "*
     * Find a valid program address
     *
     * Valid program addresses must fall off the ed25519 curve.  This function
     * iterates a nonce until it finds one that when combined with the seeds
     * results in a valid program address.
     
seeds - `Array`<`Buffer`<>|`Uint8Array`<>>
programId - `PublicKey`<>


-@return -`Promise`<(`PublicKey`<>,`number`)>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey
       -findProgramAddress)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey))
    args))

(defn PublicKey_isOnCurve "*
     * Check that a pubkey is on the ed25519 curve.
     
pubkey - `Uint8Array`<>


-@return -`bool`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey
       -isOnCurve)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -PublicKey))
    args))

(def Account
 {"constructor"  "method - `Account_constructor`" , "publicKey"  "*
     * The public key for this account
      `PublicKey`<>" , "secretKey"  "*
     * The **unencrypted** secret key for this account
      `Buffer`<>" })

(defn Account_constructor "*
     * Create a new Account object
     *
     * If the secretKey parameter is not provided a new key pair is randomly
     * created for the account
     * -@param secretKey Secret key for the account
     
secretKey - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Account)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn Account_-publicKey "*
     * The public key for this account
     "  [this] (cljs.core/aget this "publicKey" ))

(defn Account_-secretKey "*
     * The **unencrypted** secret key for this account
     "  [this] (cljs.core/aget this "secretKey" ))

(def Blockhash "`string`" )

(def EpochSchedule
 {"getEpochAndSlotIndex" 
  "method - `EpochSchedule_getEpochAndSlotIndex`" ,
  "firstNormalSlot"  "*
     * The first slot of `firstNormalEpoch`
      `number`" ,
  "slotsPerEpoch"  "*
     * The maximum number of slots in each epoch
      `number`" ,
  "leaderScheduleSlotOffset"  "*
     * The number of slots before beginning of an epoch to calculate a leader schedule for that epoch
      `number`" ,
  "getEpoch"  "method - `EpochSchedule_getEpoch`" ,
  "firstNormalEpoch"  "*
     * The first epoch with `slotsPerEpoch` slots
      `number`" ,
  "getSlotsInEpoch"  "method - `EpochSchedule_getSlotsInEpoch`" ,
  "getLastSlotInEpoch"  "method - `EpochSchedule_getLastSlotInEpoch`" ,
  "getFirstSlotInEpoch" 
  "method - `EpochSchedule_getFirstSlotInEpoch`" ,
  "warmup"  "*
     * Indicates whether epochs start short and grow
      `bool`" ,
  "constructor"  "method - `EpochSchedule_constructor`" })

(defn EpochSchedule_-slotsPerEpoch "*
     * The maximum number of slots in each epoch
     "  [this] (cljs.core/aget this "slotsPerEpoch" ))

(defn EpochSchedule_-leaderScheduleSlotOffset "*
     * The number of slots before beginning of an epoch to calculate a leader schedule for that epoch
     "  [this] (cljs.core/aget this "leaderScheduleSlotOffset" ))

(defn EpochSchedule_-warmup "*
     * Indicates whether epochs start short and grow
     "  [this] (cljs.core/aget this "warmup" ))

(defn EpochSchedule_-firstNormalEpoch "*
     * The first epoch with `slotsPerEpoch` slots
     "  [this] (cljs.core/aget this "firstNormalEpoch" ))

(defn EpochSchedule_-firstNormalSlot "*
     * The first slot of `firstNormalEpoch`
     "  [this] (cljs.core/aget this "firstNormalSlot" ))

(defn EpochSchedule_constructor "
slotsPerEpoch - `number`
leaderScheduleSlotOffset - `number`
warmup - `bool`
firstNormalEpoch - `number`
firstNormalSlot - `number`


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -EpochSchedule)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn EpochSchedule_getEpoch "
slot - `number`


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "getEpoch" ) this) args))

(defn EpochSchedule_getEpochAndSlotIndex "
slot - `number`


-@return -(`number`,`number`)"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getEpochAndSlotIndex" ) this)
    args))

(defn EpochSchedule_getFirstSlotInEpoch "
epoch - `number`


-@return -`number`"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getFirstSlotInEpoch" ) this)
    args))

(defn EpochSchedule_getLastSlotInEpoch "
epoch - `number`


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "getLastSlotInEpoch" ) this) args))

(defn EpochSchedule_getSlotsInEpoch "
epoch - `number`


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "getSlotsInEpoch" ) this) args))

(def FeeCalculator {"lamportsPerSignature"  "*
     * Cost in lamports to validate a signature.
      `number`" })

(defn FeeCalculator_-lamportsPerSignature "*
     * Cost in lamports to validate a signature.
     "  [this] (cljs.core/aget this "lamportsPerSignature" ))

(def NonceAccount
 {"authorizedPubkey"  " `PublicKey`<>" ,
  "nonce"  " `Blockhash`<>" ,
  "feeCalculator"  " `FeeCalculator`<>" ,
  "fromAccountData"  "method - `NonceAccount_fromAccountData`" })

(defn NonceAccount_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(defn NonceAccount_-nonce ""  [this] (cljs.core/aget this "nonce" ))

(defn NonceAccount_-feeCalculator
  "" 
  [this]
  (cljs.core/aget this "feeCalculator" ))

(defn NonceAccount_fromAccountData "*
     * Deserialize NonceAccount from the account data.
     * -@param buffer account data
     * -@return NonceAccount
     
buffer - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`NonceAccount`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -NonceAccount
       -fromAccountData)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -NonceAccount))
    args))

(def Signer
 {"publicKey"  " `PublicKey`<>" , "secretKey"  " `Uint8Array`<>" })

(defn Signer_-publicKey ""  [this] (cljs.core/aget this "publicKey" ))

(defn Signer_-secretKey ""  [this] (cljs.core/aget this "secretKey" ))

(def Ed25519Keypair
 {"publicKey"  " `Uint8Array`<>" , "secretKey"  " `Uint8Array`<>" })

(defn Ed25519Keypair_-publicKey
  "" 
  [this]
  (cljs.core/aget this "publicKey" ))

(defn Ed25519Keypair_-secretKey
  "" 
  [this]
  (cljs.core/aget this "secretKey" ))

(def Keypair
 {"constructor"  "method - `Keypair_constructor`" ,
  "generate"  "method - `Keypair_generate`" ,
  "fromSecretKey"  "method - `Keypair_fromSecretKey`" ,
  "fromSeed"  "method - `Keypair_fromSeed`" ,
  "publicKey"  "*
     * The public key for this keypair
      `PublicKey`<>" ,
  "secretKey"  "*
     * The raw secret key for this keypair
      `Uint8Array`<>" })

(defn Keypair_constructor "*
     * [object Object],[object Object],[object Object]
     * -@param keypair ed25519 keypair
     
keypair - `Ed25519Keypair`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Keypair)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn Keypair_generate "*
     * Generate a new random keypair
     


-@return -`Keypair`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Keypair
       -generate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Keypair))
    args))

(cljs.core/comment "can only make function currently!!" )

(defn Keypair_fromSecretKey "*
     * [object Object],[object Object],[object Object]
     * -@throws error if the provided secret key is invalid and validation is not skipped.
     * -@param secretKey secret key byte array
     * -@param options : skip secret key validation
     
secretKey - `Uint8Array`<>
options - `object`


-@return -`Keypair`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Keypair
       -fromSecretKey)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Keypair))
    args))

(defn Keypair_fromSeed "*
     * Generate a keypair from a 32 byte seed.
     * -@param seed seed byte array
     
seed - `Uint8Array`<>


-@return -`Keypair`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Keypair
       -fromSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Keypair))
    args))

(defn Keypair_-publicKey "*
     * The public key for this keypair
     "  [this] (cljs.core/aget this "publicKey" ))

(defn Keypair_-secretKey "*
     * The raw secret key for this keypair
     "  [this] (cljs.core/aget this "secretKey" ))

(defn MessageHeader_-numRequiredSignatures "*
     * The number of signatures required for this message to be considered valid. The
     * signatures must match the first `numRequiredSignatures` of `accountKeys`.
     "  [this] (cljs.core/aget this "numRequiredSignatures" ))

(defn MessageHeader_-numReadonlySignedAccounts "*
     * The last `numReadonlySignedAccounts` of the signed keys are read-only accounts
     "  [this] (cljs.core/aget this "numReadonlySignedAccounts" ))

(defn MessageHeader_-numReadonlyUnsignedAccounts "*
     * The last `numReadonlySignedAccounts` of the unsigned keys are read-only accounts
     "  [this] (cljs.core/aget this "numReadonlyUnsignedAccounts" ))

(def MessageHeader {"numRequiredSignatures"  "*
     * The number of signatures required for this message to be considered valid. The
     * signatures must match the first `numRequiredSignatures` of `accountKeys`.
      `number`" , "numReadonlySignedAccounts"  "*
     * The last `numReadonlySignedAccounts` of the signed keys are read-only accounts
      `number`" , "numReadonlyUnsignedAccounts"  "*
     * The last `numReadonlySignedAccounts` of the unsigned keys are read-only accounts
      `number`" })

(defn CompiledInstruction_-programIdIndex "*
     * Index into the transaction keys array indicating the program account that executes this instruction
     "  [this] (cljs.core/aget this "programIdIndex" ))

(defn CompiledInstruction_-accounts "*
     * Ordered indices into the transaction keys array indicating which accounts to pass to the program
     "  [this] (cljs.core/aget this "accounts" ))

(defn CompiledInstruction_-data "*
     * The program input data encoded as base 58
     "  [this] (cljs.core/aget this "data" ))

(def CompiledInstruction {"programIdIndex"  "*
     * Index into the transaction keys array indicating the program account that executes this instruction
      `number`" , "accounts"  "*
     * Ordered indices into the transaction keys array indicating which accounts to pass to the program
      `ArrayTypeAnnotation`" , "data"  "*
     * The program input data encoded as base 58
      `string`" })

(defn MessageArgs_-header "*
     * The message header, identifying signed and read-only `accountKeys`
     "  [this] (cljs.core/aget this "header" ))

(defn MessageArgs_-accountKeys "*
     * All the account keys used by this transaction
     "  [this] (cljs.core/aget this "accountKeys" ))

(defn MessageArgs_-recentBlockhash "*
     * The hash of a recent ledger block
     "  [this] (cljs.core/aget this "recentBlockhash" ))

(defn MessageArgs_-instructions "*
     * Instructions that will be executed in sequence and committed in one atomic transaction if all succeed.
     "  [this] (cljs.core/aget this "instructions" ))

(def MessageArgs {"header"  "*
     * The message header, identifying signed and read-only `accountKeys`
      `MessageHeader`<>" , "accountKeys"  "*
     * All the account keys used by this transaction
      `ArrayTypeAnnotation`" , "recentBlockhash"  "*
     * The hash of a recent ledger block
      `Blockhash`<>" , "instructions"  "*
     * Instructions that will be executed in sequence and committed in one atomic transaction if all succeed.
      `ArrayTypeAnnotation`" })

(def Message
 {"programIds"  "method - `Message_programIds`" ,
  "serialize"  "method - `Message_serialize`" ,
  "isAccountSigner"  "method - `Message_isAccountSigner`" ,
  "instructions"  " `ArrayTypeAnnotation`" ,
  "isAccountWritable"  "method - `Message_isAccountWritable`" ,
  "nonProgramIds"  "method - `Message_nonProgramIds`" ,
  "recentBlockhash"  " `Blockhash`<>" ,
  "from"  "method - `Message_from`" ,
  "accountKeys"  " `ArrayTypeAnnotation`" ,
  "isProgramId"  "method - `Message_isProgramId`" ,
  "header"  " `MessageHeader`<>" ,
  "constructor"  "method - `Message_constructor`" })

(defn Message_-header ""  [this] (cljs.core/aget this "header" ))

(defn Message_-accountKeys
  "" 
  [this]
  (cljs.core/aget this "accountKeys" ))

(defn Message_-recentBlockhash
  "" 
  [this]
  (cljs.core/aget this "recentBlockhash" ))

(defn Message_-instructions
  "" 
  [this]
  (cljs.core/aget this "instructions" ))

(defn Message_constructor "
args - `MessageArgs`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Message)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn Message_isAccountSigner "
index - `number`


-@return -`bool`"
  [this & args]
  (apply (.bind (cljs.core/aget this "isAccountSigner" ) this) args))

(defn Message_isAccountWritable "
index - `number`


-@return -`bool`"
  [this & args]
  (apply (.bind (cljs.core/aget this "isAccountWritable" ) this) args))

(defn Message_isProgramId "
index - `number`


-@return -`bool`"
  [this & args]
  (apply (.bind (cljs.core/aget this "isProgramId" ) this) args))

(defn Message_programIds "


-@return -`ArrayTypeAnnotation`"
  [this & args]
  (apply (.bind (cljs.core/aget this "programIds" ) this) args))

(defn Message_nonProgramIds "


-@return -`ArrayTypeAnnotation`"
  [this & args]
  (apply (.bind (cljs.core/aget this "nonProgramIds" ) this) args))

(defn Message_serialize "


-@return -`Buffer`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "serialize" ) this) args))

(defn Message_from "*
     * Decode a compiled message into a Message object.
     
buffer - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`Message`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Message
       -from)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Message))
    args))

(def TransactionSignature "`string`" )

(defn AccountMeta_-pubkey "*
     * An account's public key
     "  [this] (cljs.core/aget this "pubkey" ))

(defn AccountMeta_-isSigner "*
     * True if an instruction requires a transaction signature matching `pubkey`
     "  [this] (cljs.core/aget this "isSigner" ))

(defn AccountMeta_-isWritable "*
     * True if the `pubkey` can be loaded as a read-write account.
     "  [this] (cljs.core/aget this "isWritable" ))

(def AccountMeta {"pubkey"  "*
     * An account's public key
      `PublicKey`<>" , "isSigner"  "*
     * True if an instruction requires a transaction signature matching `pubkey`
      `bool`" , "isWritable"  "*
     * True if the `pubkey` can be loaded as a read-write account.
      `bool`" })

(defn TransactionInstructionCtorFields_-keys
  "" 
  [this]
  (cljs.core/aget this "keys" ))

(defn TransactionInstructionCtorFields_-programId
  "" 
  [this]
  (cljs.core/aget this "programId" ))

(defn TransactionInstructionCtorFields_-data
  "" 
  [this]
  (cljs.core/aget this "data" ))

(def TransactionInstructionCtorFields
 {"keys"  " `Array`<`AccountMeta`<>>" ,
  "programId"  " `PublicKey`<>" ,
  "data"  " `Buffer`<>" })

(defn SerializeConfig_-requireAllSignatures "*
     * Require all transaction signatures be present (default: true)
     "  [this] (cljs.core/aget this "requireAllSignatures" ))

(defn SerializeConfig_-verifySignatures "*
     * Verify provided signatures (default: true)
     "  [this] (cljs.core/aget this "verifySignatures" ))

(def SerializeConfig {"requireAllSignatures"  "*
     * Require all transaction signatures be present (default: true)
      `bool`" , "verifySignatures"  "*
     * Verify provided signatures (default: true)
      `bool`" })

(def TransactionInstruction {"keys"  "*
     * Public keys to include in this transaction
     * Boolean represents whether this pubkey needs to sign the transaction
      `Array`<`AccountMeta`<>>" , "programId"  "*
     * Program Id to execute
      `PublicKey`<>" , "data"  "*
     * Program input
      `Buffer`<>" ,
                             "constructor" 
                             "method - `TransactionInstruction_constructor`" })

(defn TransactionInstruction_-keys "*
     * Public keys to include in this transaction
     * Boolean represents whether this pubkey needs to sign the transaction
     "  [this] (cljs.core/aget this "keys" ))

(defn TransactionInstruction_-programId "*
     * Program Id to execute
     "  [this] (cljs.core/aget this "programId" ))

(defn TransactionInstruction_-data "*
     * Program input
     "  [this] (cljs.core/aget this "data" ))

(defn TransactionInstruction_constructor "
opts - `TransactionInstructionCtorFields`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -TransactionInstruction)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn SignaturePubkeyPair_-signature
  "" 
  [this]
  (cljs.core/aget this "signature" ))

(defn SignaturePubkeyPair_-publicKey
  "" 
  [this]
  (cljs.core/aget this "publicKey" ))

(def SignaturePubkeyPair
 {"signature"  " `Buffer`<>|`NullLiteralTypeAnnotation`" ,
  "publicKey"  " `PublicKey`<>" })

(defn TransactionCtorFields_-recentBlockhash "*
     * A recent blockhash
     "  [this] (cljs.core/aget this "recentBlockhash" ))

(defn TransactionCtorFields_-nonceInfo "*
     * Optional nonce information used for offline nonce'd transactions
     "  [this] (cljs.core/aget this "nonceInfo" ))

(defn TransactionCtorFields_-feePayer "*
     * The transaction fee payer
     "  [this] (cljs.core/aget this "feePayer" ))

(defn TransactionCtorFields_-signatures "*
     * One or more signatures
     "  [this] (cljs.core/aget this "signatures" ))

(def TransactionCtorFields {"recentBlockhash"  "*
     * A recent blockhash
      `Blockhash`<>|`NullLiteralTypeAnnotation`" , "nonceInfo"  "*
     * Optional nonce information used for offline nonce'd transactions
      `NonceInformation`<>|`NullLiteralTypeAnnotation`" , "feePayer"  "*
     * The transaction fee payer
      `PublicKey`<>|`NullLiteralTypeAnnotation`" , "signatures"  "*
     * One or more signatures
      `Array`<`SignaturePubkeyPair`<>>" })

(defn NonceInformation_-nonce "*
     * The current blockhash stored in the nonce
     "  [this] (cljs.core/aget this "nonce" ))

(defn NonceInformation_-nonceInstruction "*
     * AdvanceNonceAccount Instruction
     "  [this] (cljs.core/aget this "nonceInstruction" ))

(def NonceInformation {"nonce"  "*
     * The current blockhash stored in the nonce
      `Blockhash`<>" , "nonceInstruction"  "*
     * AdvanceNonceAccount Instruction
      `TransactionInstruction`<>" })

(def Transaction
 {"populate"  "method - `Transaction_populate`" ,
  "serialize"  "method - `Transaction_serialize`" ,
  "compileMessage"  "method - `Transaction_compileMessage`" ,
  "verifySignatures"  "method - `Transaction_verifySignatures`" ,
  "signatures"  "*
     * Signatures for the transaction.  Typically created by invoking the
     * `sign()` method
      `Array`<`SignaturePubkeyPair`<>>" ,
  "feePayer"  "*
     * The transaction fee payer
      `PublicKey`<>" ,
  "partialSign"  "method - `Transaction_partialSign`" ,
  "setSigners"  "method - `Transaction_setSigners`" ,
  "instructions"  "*
     * The instructions to atomically execute
      `Array`<`TransactionInstruction`<>>" ,
  "signature"  "*
     * The first (payer) Transaction signature
      `Buffer`<>|`NullLiteralTypeAnnotation`" ,
  "addSignature"  "method - `Transaction_addSignature`" ,
  "recentBlockhash"  "*
     * A recent transaction id. Must be populated by the caller
      `Blockhash`<>" ,
  "from"  "method - `Transaction_from`" ,
  "serializeMessage"  "method - `Transaction_serializeMessage`" ,
  "add"  "method - `Transaction_add`" ,
  "nonceInfo"  "*
     * Optional Nonce information. If populated, transaction will use a durable
     * Nonce hash instead of a recentBlockhash. Must be populated by the caller
      `NonceInformation`<>" ,
  "sign"  "method - `Transaction_sign`" ,
  "constructor"  "method - `Transaction_constructor`" })

(defn Transaction_-signatures "*
     * Signatures for the transaction.  Typically created by invoking the
     * `sign()` method
     "  [this] (cljs.core/aget this "signatures" ))

(defn Transaction_-signature "*
     * The first (payer) Transaction signature
     "  [this] (cljs.core/aget this "signature" ))

(defn Transaction_-feePayer "*
     * The transaction fee payer
     "  [this] (cljs.core/aget this "feePayer" ))

(defn Transaction_-instructions "*
     * The instructions to atomically execute
     "  [this] (cljs.core/aget this "instructions" ))

(defn Transaction_-recentBlockhash "*
     * A recent transaction id. Must be populated by the caller
     "  [this] (cljs.core/aget this "recentBlockhash" ))

(defn Transaction_-nonceInfo "*
     * Optional Nonce information. If populated, transaction will use a durable
     * Nonce hash instead of a recentBlockhash. Must be populated by the caller
     "  [this] (cljs.core/aget this "nonceInfo" ))

(defn Transaction_constructor "*
     * Construct an empty Transaction
     
opts - `TransactionCtorFields`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Transaction)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn Transaction_add "*
     * Add one or more instructions to this Transaction
     
& rest - `Array`<`Transaction`<>|`TransactionInstruction`<>|`TransactionInstructionCtorFields`<>>


-@return -`Transaction`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "add" ) this) args))

(defn Transaction_compileMessage "*
     * Compile transaction data
     


-@return -`Message`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "compileMessage" ) this) args))

(defn Transaction_serializeMessage "*
     * Get a buffer of the Transaction data that need to be covered by signatures
     


-@return -`Buffer`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "serializeMessage" ) this) args))

(defn Transaction_setSigners "*
     * Specify the public keys which will be used to sign the Transaction.
     * The first signer will be used as the transaction fee payer account.
     *
     * Signatures can be added with either `partialSign` or `addSignature`
     * -@deprecated Deprecated since v0.84.0. Only the fee payer needs to be
     * specified and it can be set in the Transaction constructor or with the
     * `feePayer` property.
     
& rest - `Array`<`PublicKey`<>>


-@return -`VoidTypeAnnotation`"
  [this & args]
  (apply (.bind (cljs.core/aget this "setSigners" ) this) args))

(defn Transaction_sign "*
     * Sign the Transaction with the specified signers. Multiple signatures may
     * be applied to a Transaction. The first signature is considered \"primary\"
     * and is used identify and confirm transactions.
     *
     * If the Transaction `feePayer` is not set, the first signer will be used
     * as the transaction fee payer account.
     *
     * Transaction fields should not be modified after the first call to `sign`,
     * as doing so may invalidate the signature and cause the Transaction to be
     * rejected.
     *
     * The Transaction must be assigned a valid `recentBlockhash` before invoking this method
     
& rest - `Array`<`Signer`<>>


-@return -`VoidTypeAnnotation`"
  [this & args]
  (apply (.bind (cljs.core/aget this "sign" ) this) args))

(defn Transaction_partialSign "*
     * Partially sign a transaction with the specified accounts. All accounts must
     * correspond to either the fee payer or a signer account in the transaction
     * instructions.
     *
     * All the caveats from the `sign` method apply to `partialSign`
     
& rest - `Array`<`Signer`<>>


-@return -`VoidTypeAnnotation`"
  [this & args]
  (apply (.bind (cljs.core/aget this "partialSign" ) this) args))

(defn Transaction_addSignature "*
     * Add an externally created signature to a transaction. The public key
     * must correspond to either the fee payer or a signer account in the transaction
     * instructions.
     
pubkey - `PublicKey`<>
signature - `Buffer`<>


-@return -`VoidTypeAnnotation`"
  [this & args]
  (apply (.bind (cljs.core/aget this "addSignature" ) this) args))

(defn Transaction_verifySignatures "*
     * Verify signatures of a complete, signed Transaction
     


-@return -`bool`"
  [this & args]
  (apply (.bind (cljs.core/aget this "verifySignatures" ) this) args))

(defn Transaction_serialize "*
     * Serialize the Transaction in the wire format.
     
config - `SerializeConfig`<>


-@return -`Buffer`<>"
  [this & args]
  (apply (.bind (cljs.core/aget this "serialize" ) this) args))

(defn Transaction_from "*
     * Parse a wire transaction into a Transaction object.
     
buffer - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Transaction
       -from)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Transaction))
    args))

(defn Transaction_populate "*
     * Populate Transaction object from message and signatures
     
message - `Message`<>
signatures - `Array`<`string`>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Transaction
       -populate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Transaction))
    args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(def TokenAccountsFilter "`object`|`object`" )

(defn Context_-slot ""  [this] (cljs.core/aget this "slot" ))

(def Context {"slot"  " `number`" })

(defn SendOptions_-skipPreflight "*
     * disable transaction verification step
     "  [this] (cljs.core/aget this "skipPreflight" ))

(defn SendOptions_-preflightCommitment "*
     * preflight commitment level
     "  [this] (cljs.core/aget this "preflightCommitment" ))

(def SendOptions {"skipPreflight"  "*
     * disable transaction verification step
      `bool`" , "preflightCommitment"  "*
     * preflight commitment level
      `Commitment`<>" })

(defn ConfirmOptions_-skipPreflight "*
     * disable transaction verification step
     "  [this] (cljs.core/aget this "skipPreflight" ))

(defn ConfirmOptions_-commitment "*
     * desired commitment level
     "  [this] (cljs.core/aget this "commitment" ))

(defn ConfirmOptions_-preflightCommitment "*
     * preflight commitment level
     "  [this] (cljs.core/aget this "preflightCommitment" ))

(def ConfirmOptions {"skipPreflight"  "*
     * disable transaction verification step
      `bool`" , "commitment"  "*
     * desired commitment level
      `Commitment`<>" , "preflightCommitment"  "*
     * preflight commitment level
      `Commitment`<>" })

(defn ConfirmedSignaturesForAddress2Options_-before "*
     * Start searching backwards from this transaction signature.
     * -@remark If not provided the search starts from the highest max confirmed block.
     "  [this] (cljs.core/aget this "before" ))

(defn ConfirmedSignaturesForAddress2Options_-until "*
     * Search until this transaction signature is reached, if found before `limit`.
     "  [this] (cljs.core/aget this "until" ))

(defn ConfirmedSignaturesForAddress2Options_-limit "*
     * Maximum transaction signatures to return (between 1 and 1,000, default: 1,000).
     "  [this] (cljs.core/aget this "limit" ))

(def ConfirmedSignaturesForAddress2Options {"before"  "*
     * Start searching backwards from this transaction signature.
     * -@remark If not provided the search starts from the highest max confirmed block.
      `TransactionSignature`<>" , "until"  "*
     * Search until this transaction signature is reached, if found before `limit`.
      `TransactionSignature`<>" , "limit"  "*
     * Maximum transaction signatures to return (between 1 and 1,000, default: 1,000).
      `number`" })

(defn SignaturesForAddressOptions_-before "*
     * Start searching backwards from this transaction signature.
     * -@remark If not provided the search starts from the highest max confirmed block.
     "  [this] (cljs.core/aget this "before" ))

(defn SignaturesForAddressOptions_-until "*
     * Search until this transaction signature is reached, if found before `limit`.
     "  [this] (cljs.core/aget this "until" ))

(defn SignaturesForAddressOptions_-limit "*
     * Maximum transaction signatures to return (between 1 and 1,000, default: 1,000).
     "  [this] (cljs.core/aget this "limit" ))

(def SignaturesForAddressOptions {"before"  "*
     * Start searching backwards from this transaction signature.
     * -@remark If not provided the search starts from the highest max confirmed block.
      `TransactionSignature`<>" , "until"  "*
     * Search until this transaction signature is reached, if found before `limit`.
      `TransactionSignature`<>" , "limit"  "*
     * Maximum transaction signatures to return (between 1 and 1,000, default: 1,000).
      `number`" })

(defn RpcResponseAndContext_-context "*
     * response context
     "  [this] (cljs.core/aget this "context" ))

(defn RpcResponseAndContext_-value "*
     * response value
     "  [this] (cljs.core/aget this "value" ))

(def RpcResponseAndContext {"context"  "*
     * response context
      `Context`<>" , "value"  "*
     * response value
      `T`<>" })

(def Commitment
 "\"processed\"|\"confirmed\"|\"finalized\"|\"recent\"|\"single\"|\"singleGossip\"|\"root\"|\"max\"" )

(def Finality "\"confirmed\"|\"finalized\"" )

(def LargestAccountsFilter "\"circulating\"|\"nonCirculating\"" )

(defn GetLargestAccountsConfig_-commitment "*
     * The level of commitment desired
     "  [this] (cljs.core/aget this "commitment" ))

(defn GetLargestAccountsConfig_-filter "*
     * Filter largest accounts by whether they are part of the circulating supply
     "  [this] (cljs.core/aget this "filter" ))

(def GetLargestAccountsConfig {"commitment"  "*
     * The level of commitment desired
      `Commitment`<>" , "filter"  "*
     * Filter largest accounts by whether they are part of the circulating supply
      `LargestAccountsFilter`<>" })

(defn GetSupplyConfig_-commitment "*
     * The level of commitment desired
     "  [this] (cljs.core/aget this "commitment" ))

(defn GetSupplyConfig_-excludeNonCirculatingAccountsList "*
     * Exclude non circulating accounts list from response
     " 
  [this]
  (cljs.core/aget this "excludeNonCirculatingAccountsList" ))

(def GetSupplyConfig {"commitment"  "*
     * The level of commitment desired
      `Commitment`<>" , "excludeNonCirculatingAccountsList"  "*
     * Exclude non circulating accounts list from response
      `bool`" })

(defn SignatureStatusConfig_-searchTransactionHistory "*
     * enable searching status history, not needed for recent transactions
     "  [this] (cljs.core/aget this "searchTransactionHistory" ))

(def SignatureStatusConfig {"searchTransactionHistory"  "*
     * enable searching status history, not needed for recent transactions
      `bool`" })

(defn ContactInfo_-pubkey "*
     * Identity public key of the node
     "  [this] (cljs.core/aget this "pubkey" ))

(defn ContactInfo_-gossip "*
     * Gossip network address for the node
     "  [this] (cljs.core/aget this "gossip" ))

(defn ContactInfo_-tpu "*
     * TPU network address for the node (null if not available)
     "  [this] (cljs.core/aget this "tpu" ))

(defn ContactInfo_-rpc "*
     * JSON RPC network address for the node (null if not available)
     "  [this] (cljs.core/aget this "rpc" ))

(defn ContactInfo_-version "*
     * Software version of the node (null if not available)
     "  [this] (cljs.core/aget this "version" ))

(def ContactInfo {"pubkey"  "*
     * Identity public key of the node
      `string`" , "gossip"  "*
     * Gossip network address for the node
      `string`|`NullLiteralTypeAnnotation`" , "tpu"  "*
     * TPU network address for the node (null if not available)
      `string`|`NullLiteralTypeAnnotation`" , "rpc"  "*
     * JSON RPC network address for the node (null if not available)
      `string`|`NullLiteralTypeAnnotation`" , "version"  "*
     * Software version of the node (null if not available)
      `string`|`NullLiteralTypeAnnotation`" })

(defn VoteAccountInfo_-votePubkey "*
     * Public key of the vote account
     "  [this] (cljs.core/aget this "votePubkey" ))

(defn VoteAccountInfo_-nodePubkey "*
     * Identity public key of the node voting with this account
     "  [this] (cljs.core/aget this "nodePubkey" ))

(defn VoteAccountInfo_-activatedStake "*
     * The stake, in lamports, delegated to this vote account and activated
     "  [this] (cljs.core/aget this "activatedStake" ))

(defn VoteAccountInfo_-epochVoteAccount "*
     * Whether the vote account is staked for this epoch
     "  [this] (cljs.core/aget this "epochVoteAccount" ))

(defn VoteAccountInfo_-epochCredits "*
     * Recent epoch voting credit history for this voter
     "  [this] (cljs.core/aget this "epochCredits" ))

(defn VoteAccountInfo_-commission "*
     * A percentage (0-100) of rewards payout owed to the voter
     "  [this] (cljs.core/aget this "commission" ))

(defn VoteAccountInfo_-lastVote "*
     * Most recent slot voted on by this vote account
     "  [this] (cljs.core/aget this "lastVote" ))

(def VoteAccountInfo {"votePubkey"  "*
     * Public key of the vote account
      `string`" , "nodePubkey"  "*
     * Identity public key of the node voting with this account
      `string`" , "activatedStake"  "*
     * The stake, in lamports, delegated to this vote account and activated
      `number`" , "epochVoteAccount"  "*
     * Whether the vote account is staked for this epoch
      `bool`" , "epochCredits"  "*
     * Recent epoch voting credit history for this voter
      `Array`<(`number`,`number`,`number`)>" , "commission"  "*
     * A percentage (0-100) of rewards payout owed to the voter
      `number`" , "lastVote"  "*
     * Most recent slot voted on by this vote account
      `number`" })

(defn VoteAccountStatus_-current "*
     * Active vote accounts
     "  [this] (cljs.core/aget this "current" ))

(defn VoteAccountStatus_-delinquent "*
     * Inactive vote accounts
     "  [this] (cljs.core/aget this "delinquent" ))

(def VoteAccountStatus {"current"  "*
     * Active vote accounts
      `Array`<`VoteAccountInfo`<>>" , "delinquent"  "*
     * Inactive vote accounts
      `Array`<`VoteAccountInfo`<>>" })

(defn InflationGovernor_-foundation
  "" 
  [this]
  (cljs.core/aget this "foundation" ))

(defn InflationGovernor_-foundationTerm
  "" 
  [this]
  (cljs.core/aget this "foundationTerm" ))

(defn InflationGovernor_-initial
  "" 
  [this]
  (cljs.core/aget this "initial" ))

(defn InflationGovernor_-taper
  "" 
  [this]
  (cljs.core/aget this "taper" ))

(defn InflationGovernor_-terminal
  "" 
  [this]
  (cljs.core/aget this "terminal" ))

(def InflationGovernor
 {"foundation"  " `number`" ,
  "foundationTerm"  " `number`" ,
  "initial"  " `number`" ,
  "taper"  " `number`" ,
  "terminal"  " `number`" })

(defn InflationReward_-epoch "*
     * epoch for which the reward occurs
     "  [this] (cljs.core/aget this "epoch" ))

(defn InflationReward_-effectiveSlot "*
     * the slot in which the rewards are effective
     "  [this] (cljs.core/aget this "effectiveSlot" ))

(defn InflationReward_-amount "*
     * reward amount in lamports
     "  [this] (cljs.core/aget this "amount" ))

(defn InflationReward_-postBalance "*
     * post balance of the account in lamports
     "  [this] (cljs.core/aget this "postBalance" ))

(def InflationReward {"epoch"  "*
     * epoch for which the reward occurs
      `number`" , "effectiveSlot"  "*
     * the slot in which the rewards are effective
      `number`" , "amount"  "*
     * reward amount in lamports
      `number`" , "postBalance"  "*
     * post balance of the account in lamports
      `number`" })

(defn EpochInfo_-epoch ""  [this] (cljs.core/aget this "epoch" ))

(defn EpochInfo_-slotIndex
  "" 
  [this]
  (cljs.core/aget this "slotIndex" ))

(defn EpochInfo_-slotsInEpoch
  "" 
  [this]
  (cljs.core/aget this "slotsInEpoch" ))

(defn EpochInfo_-absoluteSlot
  "" 
  [this]
  (cljs.core/aget this "absoluteSlot" ))

(defn EpochInfo_-blockHeight
  "" 
  [this]
  (cljs.core/aget this "blockHeight" ))

(defn EpochInfo_-transactionCount
  "" 
  [this]
  (cljs.core/aget this "transactionCount" ))

(def EpochInfo
 {"epoch"  " `number`" ,
  "slotIndex"  " `number`" ,
  "slotsInEpoch"  " `number`" ,
  "absoluteSlot"  " `number`" ,
  "blockHeight"  " `number`" ,
  "transactionCount"  " `number`" })

(def LeaderSchedule {})

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(def Version {nil " `number`" })

(defn SimulatedTransactionAccountInfo_-executable "*
     * `true` if this account's data contains a loaded program
     "  [this] (cljs.core/aget this "executable" ))

(defn SimulatedTransactionAccountInfo_-owner "*
     * Identifier of the program that owns the account
     "  [this] (cljs.core/aget this "owner" ))

(defn SimulatedTransactionAccountInfo_-lamports "*
     * Number of lamports assigned to the account
     "  [this] (cljs.core/aget this "lamports" ))

(defn SimulatedTransactionAccountInfo_-data "*
     * Optional data assigned to the account
     "  [this] (cljs.core/aget this "data" ))

(defn SimulatedTransactionAccountInfo_-rentEpoch "*
     * Optional rent epoch info for account
     "  [this] (cljs.core/aget this "rentEpoch" ))

(def SimulatedTransactionAccountInfo {"executable"  "*
     * `true` if this account's data contains a loaded program
      `bool`" , "owner"  "*
     * Identifier of the program that owns the account
      `string`" , "lamports"  "*
     * Number of lamports assigned to the account
      `number`" , "data"  "*
     * Optional data assigned to the account
      `ArrayTypeAnnotation`" , "rentEpoch"  "*
     * Optional rent epoch info for account
      `number`" })

(defn SimulatedTransactionResponse_-err
  "" 
  [this]
  (cljs.core/aget this "err" ))

(defn SimulatedTransactionResponse_-logs
  "" 
  [this]
  (cljs.core/aget this "logs" ))

(defn SimulatedTransactionResponse_-accounts
  "" 
  [this]
  (cljs.core/aget this "accounts" ))

(defn SimulatedTransactionResponse_-unitsConsumed
  "" 
  [this]
  (cljs.core/aget this "unitsConsumed" ))

(def SimulatedTransactionResponse
 {"err"  " `TransactionError`<>|`string`|`NullLiteralTypeAnnotation`" ,
  "logs"  " `Array`<`string`>|`NullLiteralTypeAnnotation`" ,
  "accounts"  " `ArrayTypeAnnotation`|`NullLiteralTypeAnnotation`" ,
  "unitsConsumed"  " `number`" })

(defn ParsedInnerInstruction_-index
  "" 
  [this]
  (cljs.core/aget this "index" ))

(defn ParsedInnerInstruction_-instructions
  "" 
  [this]
  (cljs.core/aget this "instructions" ))

(def ParsedInnerInstruction
 {"index"  " `number`" , "instructions"  " `ArrayTypeAnnotation`" })

(defn TokenBalance_-accountIndex
  "" 
  [this]
  (cljs.core/aget this "accountIndex" ))

(defn TokenBalance_-mint ""  [this] (cljs.core/aget this "mint" ))

(defn TokenBalance_-owner ""  [this] (cljs.core/aget this "owner" ))

(defn TokenBalance_-uiTokenAmount
  "" 
  [this]
  (cljs.core/aget this "uiTokenAmount" ))

(def TokenBalance
 {"accountIndex"  " `number`" ,
  "mint"  " `string`" ,
  "owner"  " `string`" ,
  "uiTokenAmount"  " `TokenAmount`<>" })

(defn ParsedConfirmedTransactionMeta_-fee "*
     * The fee charged for processing the transaction
     "  [this] (cljs.core/aget this "fee" ))

(defn ParsedConfirmedTransactionMeta_-innerInstructions "*
     * An array of cross program invoked parsed instructions
     "  [this] (cljs.core/aget this "innerInstructions" ))

(defn ParsedConfirmedTransactionMeta_-preBalances "*
     * The balances of the transaction accounts before processing
     "  [this] (cljs.core/aget this "preBalances" ))

(defn ParsedConfirmedTransactionMeta_-postBalances "*
     * The balances of the transaction accounts after processing
     "  [this] (cljs.core/aget this "postBalances" ))

(defn ParsedConfirmedTransactionMeta_-logMessages "*
     * An array of program log messages emitted during a transaction
     "  [this] (cljs.core/aget this "logMessages" ))

(defn ParsedConfirmedTransactionMeta_-preTokenBalances "*
     * The token balances of the transaction accounts before processing
     "  [this] (cljs.core/aget this "preTokenBalances" ))

(defn ParsedConfirmedTransactionMeta_-postTokenBalances "*
     * The token balances of the transaction accounts after processing
     "  [this] (cljs.core/aget this "postTokenBalances" ))

(defn ParsedConfirmedTransactionMeta_-err "*
     * The error result of transaction processing
     "  [this] (cljs.core/aget this "err" ))

(def ParsedConfirmedTransactionMeta {"fee"  "*
     * The fee charged for processing the transaction
      `number`" , "innerInstructions"  "*
     * An array of cross program invoked parsed instructions
      `ArrayTypeAnnotation`|`NullLiteralTypeAnnotation`" ,
                                     "preBalances"  "*
     * The balances of the transaction accounts before processing
      `Array`<`number`>" ,
                                     "postBalances"  "*
     * The balances of the transaction accounts after processing
      `Array`<`number`>" ,
                                     "logMessages"  "*
     * An array of program log messages emitted during a transaction
      `Array`<`string`>|`NullLiteralTypeAnnotation`" ,
                                     "preTokenBalances"  "*
     * The token balances of the transaction accounts before processing
      `Array`<`TokenBalance`<>>|`NullLiteralTypeAnnotation`" ,
                                     "postTokenBalances"  "*
     * The token balances of the transaction accounts after processing
      `Array`<`TokenBalance`<>>|`NullLiteralTypeAnnotation`" ,
                                     "err"  "*
     * The error result of transaction processing
      `TransactionError`<>|`NullLiteralTypeAnnotation`" })

(defn CompiledInnerInstruction_-index
  "" 
  [this]
  (cljs.core/aget this "index" ))

(defn CompiledInnerInstruction_-instructions
  "" 
  [this]
  (cljs.core/aget this "instructions" ))

(def CompiledInnerInstruction
 {"index"  " `number`" , "instructions"  " `ArrayTypeAnnotation`" })

(defn ConfirmedTransactionMeta_-fee "*
     * The fee charged for processing the transaction
     "  [this] (cljs.core/aget this "fee" ))

(defn ConfirmedTransactionMeta_-innerInstructions "*
     * An array of cross program invoked instructions
     "  [this] (cljs.core/aget this "innerInstructions" ))

(defn ConfirmedTransactionMeta_-preBalances "*
     * The balances of the transaction accounts before processing
     "  [this] (cljs.core/aget this "preBalances" ))

(defn ConfirmedTransactionMeta_-postBalances "*
     * The balances of the transaction accounts after processing
     "  [this] (cljs.core/aget this "postBalances" ))

(defn ConfirmedTransactionMeta_-logMessages "*
     * An array of program log messages emitted during a transaction
     "  [this] (cljs.core/aget this "logMessages" ))

(defn ConfirmedTransactionMeta_-preTokenBalances "*
     * The token balances of the transaction accounts before processing
     "  [this] (cljs.core/aget this "preTokenBalances" ))

(defn ConfirmedTransactionMeta_-postTokenBalances "*
     * The token balances of the transaction accounts after processing
     "  [this] (cljs.core/aget this "postTokenBalances" ))

(defn ConfirmedTransactionMeta_-err "*
     * The error result of transaction processing
     "  [this] (cljs.core/aget this "err" ))

(def ConfirmedTransactionMeta {"fee"  "*
     * The fee charged for processing the transaction
      `number`" , "innerInstructions"  "*
     * An array of cross program invoked instructions
      `ArrayTypeAnnotation`|`NullLiteralTypeAnnotation`" ,
                               "preBalances"  "*
     * The balances of the transaction accounts before processing
      `Array`<`number`>" ,
                               "postBalances"  "*
     * The balances of the transaction accounts after processing
      `Array`<`number`>" ,
                               "logMessages"  "*
     * An array of program log messages emitted during a transaction
      `Array`<`string`>|`NullLiteralTypeAnnotation`" ,
                               "preTokenBalances"  "*
     * The token balances of the transaction accounts before processing
      `Array`<`TokenBalance`<>>|`NullLiteralTypeAnnotation`" ,
                               "postTokenBalances"  "*
     * The token balances of the transaction accounts after processing
      `Array`<`TokenBalance`<>>|`NullLiteralTypeAnnotation`" ,
                               "err"  "*
     * The error result of transaction processing
      `TransactionError`<>|`NullLiteralTypeAnnotation`" })

(defn TransactionResponse_-slot "*
     * The slot during which the transaction was processed
     "  [this] (cljs.core/aget this "slot" ))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn TransactionResponse_-transaction "*
     * The transaction
     "  [this] (cljs.core/aget this "transaction" ))

(defn TransactionResponse_-meta "*
     * Metadata produced from the transaction
     "  [this] (cljs.core/aget this "meta" ))

(defn TransactionResponse_-blockTime "*
     * The unix timestamp of when the transaction was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def TransactionResponse {"slot"  "*
     * The slot during which the transaction was processed
      `number`" , "transaction"  "*
     * The transaction
      `object`" , "meta"  "*
     * Metadata produced from the transaction
      `ConfirmedTransactionMeta`<>|`NullLiteralTypeAnnotation`" ,
                          "blockTime"  "*
     * The unix timestamp of when the transaction was processed
      `number`|`NullLiteralTypeAnnotation`" })

(defn ConfirmedTransaction_-slot "*
     * The slot during which the transaction was processed
     "  [this] (cljs.core/aget this "slot" ))

(defn ConfirmedTransaction_-transaction "*
     * The details of the transaction
     "  [this] (cljs.core/aget this "transaction" ))

(defn ConfirmedTransaction_-meta "*
     * Metadata produced from the transaction
     "  [this] (cljs.core/aget this "meta" ))

(defn ConfirmedTransaction_-blockTime "*
     * The unix timestamp of when the transaction was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def ConfirmedTransaction {"slot"  "*
     * The slot during which the transaction was processed
      `number`" , "transaction"  "*
     * The details of the transaction
      `Transaction`<>" , "meta"  "*
     * Metadata produced from the transaction
      `ConfirmedTransactionMeta`<>|`NullLiteralTypeAnnotation`" ,
                           "blockTime"  "*
     * The unix timestamp of when the transaction was processed
      `number`|`NullLiteralTypeAnnotation`" })

(defn PartiallyDecodedInstruction_-programId "*
     * Program id called by this instruction
     "  [this] (cljs.core/aget this "programId" ))

(defn PartiallyDecodedInstruction_-accounts "*
     * Public keys of accounts passed to this instruction
     "  [this] (cljs.core/aget this "accounts" ))

(defn PartiallyDecodedInstruction_-data "*
     * Raw base-58 instruction data
     "  [this] (cljs.core/aget this "data" ))

(def PartiallyDecodedInstruction {"programId"  "*
     * Program id called by this instruction
      `PublicKey`<>" , "accounts"  "*
     * Public keys of accounts passed to this instruction
      `Array`<`PublicKey`<>>" , "data"  "*
     * Raw base-58 instruction data
      `string`" })

(defn ParsedMessageAccount_-pubkey "*
     * Public key of the account
     "  [this] (cljs.core/aget this "pubkey" ))

(defn ParsedMessageAccount_-signer "*
     * Indicates if the account signed the transaction
     "  [this] (cljs.core/aget this "signer" ))

(defn ParsedMessageAccount_-writable "*
     * Indicates if the account is writable for this transaction
     "  [this] (cljs.core/aget this "writable" ))

(def ParsedMessageAccount {"pubkey"  "*
     * Public key of the account
      `PublicKey`<>" , "signer"  "*
     * Indicates if the account signed the transaction
      `bool`" , "writable"  "*
     * Indicates if the account is writable for this transaction
      `bool`" })

(defn ParsedInstruction_-program "*
     * Name of the program for this instruction
     "  [this] (cljs.core/aget this "program" ))

(defn ParsedInstruction_-programId "*
     * ID of the program for this instruction
     "  [this] (cljs.core/aget this "programId" ))

(defn ParsedInstruction_-parsed "*
     * Parsed instruction info
     "  [this] (cljs.core/aget this "parsed" ))

(def ParsedInstruction {"program"  "*
     * Name of the program for this instruction
      `string`" , "programId"  "*
     * ID of the program for this instruction
      `PublicKey`<>" , "parsed"  "*
     * Parsed instruction info
      `any`" })

(defn ParsedMessage_-accountKeys "*
     * Accounts used in the instructions
     "  [this] (cljs.core/aget this "accountKeys" ))

(defn ParsedMessage_-instructions "*
     * The atomically executed instructions for the transaction
     "  [this] (cljs.core/aget this "instructions" ))

(defn ParsedMessage_-recentBlockhash "*
     * Recent blockhash
     "  [this] (cljs.core/aget this "recentBlockhash" ))

(def ParsedMessage {"accountKeys"  "*
     * Accounts used in the instructions
      `ArrayTypeAnnotation`" , "instructions"  "*
     * The atomically executed instructions for the transaction
      `ArrayTypeAnnotation`" , "recentBlockhash"  "*
     * Recent blockhash
      `string`" })

(defn ParsedTransaction_-signatures "*
     * Signatures for the transaction
     "  [this] (cljs.core/aget this "signatures" ))

(defn ParsedTransaction_-message "*
     * Message of the transaction
     "  [this] (cljs.core/aget this "message" ))

(def ParsedTransaction {"signatures"  "*
     * Signatures for the transaction
      `Array`<`string`>" , "message"  "*
     * Message of the transaction
      `ParsedMessage`<>" })

(defn ParsedConfirmedTransaction_-slot "*
     * The slot during which the transaction was processed
     "  [this] (cljs.core/aget this "slot" ))

(defn ParsedConfirmedTransaction_-transaction "*
     * The details of the transaction
     "  [this] (cljs.core/aget this "transaction" ))

(defn ParsedConfirmedTransaction_-meta "*
     * Metadata produced from the transaction
     "  [this] (cljs.core/aget this "meta" ))

(defn ParsedConfirmedTransaction_-blockTime "*
     * The unix timestamp of when the transaction was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def ParsedConfirmedTransaction {"slot"  "*
     * The slot during which the transaction was processed
      `number`" , "transaction"  "*
     * The details of the transaction
      `ParsedTransaction`<>" , "meta"  "*
     * Metadata produced from the transaction
      `ParsedConfirmedTransactionMeta`<>|`NullLiteralTypeAnnotation`" ,
                                 "blockTime"  "*
     * The unix timestamp of when the transaction was processed
      `number`|`NullLiteralTypeAnnotation`" })

(defn BlockResponse_-blockhash "*
     * Blockhash of this block
     "  [this] (cljs.core/aget this "blockhash" ))

(defn BlockResponse_-previousBlockhash "*
     * Blockhash of this block's parent
     "  [this] (cljs.core/aget this "previousBlockhash" ))

(defn BlockResponse_-parentSlot "*
     * Slot index of this block's parent
     "  [this] (cljs.core/aget this "parentSlot" ))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn BlockResponse_-transactions "*
     * Vector of transactions with status meta and original message
     "  [this] (cljs.core/aget this "transactions" ))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn BlockResponse_-rewards "*
     * Vector of block rewards
     "  [this] (cljs.core/aget this "rewards" ))

(defn BlockResponse_-blockTime "*
     * The unix timestamp of when the block was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def BlockResponse {"blockhash"  "*
     * Blockhash of this block
      `Blockhash`<>" , "previousBlockhash"  "*
     * Blockhash of this block's parent
      `Blockhash`<>" , "parentSlot"  "*
     * Slot index of this block's parent
      `number`" , "transactions"  "*
     * Vector of transactions with status meta and original message
      `Array`<`object`>" , "rewards"  "*
     * Vector of block rewards
      `Array`<`object`>" , "blockTime"  "*
     * The unix timestamp of when the block was processed
      `number`|`NullLiteralTypeAnnotation`" })

(defn ConfirmedBlock_-blockhash "*
     * Blockhash of this block
     "  [this] (cljs.core/aget this "blockhash" ))

(defn ConfirmedBlock_-previousBlockhash "*
     * Blockhash of this block's parent
     "  [this] (cljs.core/aget this "previousBlockhash" ))

(defn ConfirmedBlock_-parentSlot "*
     * Slot index of this block's parent
     "  [this] (cljs.core/aget this "parentSlot" ))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn ConfirmedBlock_-transactions "*
     * Vector of transactions and status metas
     "  [this] (cljs.core/aget this "transactions" ))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn ConfirmedBlock_-rewards "*
     * Vector of block rewards
     "  [this] (cljs.core/aget this "rewards" ))

(defn ConfirmedBlock_-blockTime "*
     * The unix timestamp of when the block was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def ConfirmedBlock {"blockhash"  "*
     * Blockhash of this block
      `Blockhash`<>" , "previousBlockhash"  "*
     * Blockhash of this block's parent
      `Blockhash`<>" , "parentSlot"  "*
     * Slot index of this block's parent
      `number`" , "transactions"  "*
     * Vector of transactions and status metas
      `Array`<`object`>" , "rewards"  "*
     * Vector of block rewards
      `Array`<`object`>" , "blockTime"  "*
     * The unix timestamp of when the block was processed
      `number`|`NullLiteralTypeAnnotation`" })

(defn ConfirmedBlockSignatures_-blockhash "*
     * Blockhash of this block
     "  [this] (cljs.core/aget this "blockhash" ))

(defn ConfirmedBlockSignatures_-previousBlockhash "*
     * Blockhash of this block's parent
     "  [this] (cljs.core/aget this "previousBlockhash" ))

(defn ConfirmedBlockSignatures_-parentSlot "*
     * Slot index of this block's parent
     "  [this] (cljs.core/aget this "parentSlot" ))

(defn ConfirmedBlockSignatures_-signatures "*
     * Vector of signatures
     "  [this] (cljs.core/aget this "signatures" ))

(defn ConfirmedBlockSignatures_-blockTime "*
     * The unix timestamp of when the block was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def ConfirmedBlockSignatures {"blockhash"  "*
     * Blockhash of this block
      `Blockhash`<>" , "previousBlockhash"  "*
     * Blockhash of this block's parent
      `Blockhash`<>" , "parentSlot"  "*
     * Slot index of this block's parent
      `number`" , "signatures"  "*
     * Vector of signatures
      `Array`<`string`>" , "blockTime"  "*
     * The unix timestamp of when the block was processed
      `number`|`NullLiteralTypeAnnotation`" })

(defn PerfSample_-slot "*
     * Slot number of sample
     "  [this] (cljs.core/aget this "slot" ))

(defn PerfSample_-numTransactions "*
     * Number of transactions in a sample window
     "  [this] (cljs.core/aget this "numTransactions" ))

(defn PerfSample_-numSlots "*
     * Number of slots in a sample window
     "  [this] (cljs.core/aget this "numSlots" ))

(defn PerfSample_-samplePeriodSecs "*
     * Sample window in seconds
     "  [this] (cljs.core/aget this "samplePeriodSecs" ))

(def PerfSample {"slot"  "*
     * Slot number of sample
      `number`" , "numTransactions"  "*
     * Number of transactions in a sample window
      `number`" , "numSlots"  "*
     * Number of slots in a sample window
      `number`" , "samplePeriodSecs"  "*
     * Sample window in seconds
      `number`" })

(defn Supply_-total "*
     * Total supply in lamports
     "  [this] (cljs.core/aget this "total" ))

(defn Supply_-circulating "*
     * Circulating supply in lamports
     "  [this] (cljs.core/aget this "circulating" ))

(defn Supply_-nonCirculating "*
     * Non-circulating supply in lamports
     "  [this] (cljs.core/aget this "nonCirculating" ))

(defn Supply_-nonCirculatingAccounts "*
     * List of non-circulating account addresses
     "  [this] (cljs.core/aget this "nonCirculatingAccounts" ))

(def Supply {"total"  "*
     * Total supply in lamports
      `number`" , "circulating"  "*
     * Circulating supply in lamports
      `number`" , "nonCirculating"  "*
     * Non-circulating supply in lamports
      `number`" , "nonCirculatingAccounts"  "*
     * List of non-circulating account addresses
      `Array`<`PublicKey`<>>" })

(defn TokenAmount_-amount "*
     * Raw amount of tokens as string ignoring decimals
     "  [this] (cljs.core/aget this "amount" ))

(defn TokenAmount_-decimals "*
     * Number of decimals configured for token's mint
     "  [this] (cljs.core/aget this "decimals" ))

(defn TokenAmount_-uiAmount "*
     * Token amount as float, accounts for decimals
     "  [this] (cljs.core/aget this "uiAmount" ))

(defn TokenAmount_-uiAmountString "*
     * Token amount as string, accounts for decimals
     "  [this] (cljs.core/aget this "uiAmountString" ))

(def TokenAmount {"amount"  "*
     * Raw amount of tokens as string ignoring decimals
      `string`" , "decimals"  "*
     * Number of decimals configured for token's mint
      `number`" , "uiAmount"  "*
     * Token amount as float, accounts for decimals
      `number`|`NullLiteralTypeAnnotation`" , "uiAmountString"  "*
     * Token amount as string, accounts for decimals
      `string`" })

(defn TokenAccountBalancePair_-address "*
     * Address of the token account
     "  [this] (cljs.core/aget this "address" ))

(defn TokenAccountBalancePair_-amount "*
     * Raw amount of tokens as string ignoring decimals
     "  [this] (cljs.core/aget this "amount" ))

(defn TokenAccountBalancePair_-decimals "*
     * Number of decimals configured for token's mint
     "  [this] (cljs.core/aget this "decimals" ))

(defn TokenAccountBalancePair_-uiAmount "*
     * Token amount as float, accounts for decimals
     "  [this] (cljs.core/aget this "uiAmount" ))

(defn TokenAccountBalancePair_-uiAmountString "*
     * Token amount as string, accounts for decimals
     "  [this] (cljs.core/aget this "uiAmountString" ))

(def TokenAccountBalancePair {"address"  "*
     * Address of the token account
      `PublicKey`<>" , "amount"  "*
     * Raw amount of tokens as string ignoring decimals
      `string`" , "decimals"  "*
     * Number of decimals configured for token's mint
      `number`" , "uiAmount"  "*
     * Token amount as float, accounts for decimals
      `number`|`NullLiteralTypeAnnotation`" , "uiAmountString"  "*
     * Token amount as string, accounts for decimals
      `string`" })

(defn AccountBalancePair_-address
  "" 
  [this]
  (cljs.core/aget this "address" ))

(defn AccountBalancePair_-lamports
  "" 
  [this]
  (cljs.core/aget this "lamports" ))

(def AccountBalancePair
 {"address"  " `PublicKey`<>" , "lamports"  " `number`" })

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(def SlotUpdate
 "`object`|`object`|`object`|`object`|`object`|`object`|`object`" )

(defn SlotInfo_-slot "*
     * Currently processing slot
     "  [this] (cljs.core/aget this "slot" ))

(defn SlotInfo_-parent "*
     * Parent of the current slot
     "  [this] (cljs.core/aget this "parent" ))

(defn SlotInfo_-root "*
     * The root block of the current slot's fork
     "  [this] (cljs.core/aget this "root" ))

(def SlotInfo {"slot"  "*
     * Currently processing slot
      `number`" , "parent"  "*
     * Parent of the current slot
      `number`" , "root"  "*
     * The root block of the current slot's fork
      `number`" })

(defn ParsedAccountData_-program "*
     * Name of the program that owns this account
     "  [this] (cljs.core/aget this "program" ))

(defn ParsedAccountData_-parsed "*
     * Parsed account data
     "  [this] (cljs.core/aget this "parsed" ))

(defn ParsedAccountData_-space "*
     * Space used by account data
     "  [this] (cljs.core/aget this "space" ))

(def ParsedAccountData {"program"  "*
     * Name of the program that owns this account
      `string`" , "parsed"  "*
     * Parsed account data
      `any`" , "space"  "*
     * Space used by account data
      `number`" })

(defn StakeActivationData_-state "*
     * the stake account's activation state
     "  [this] (cljs.core/aget this "state" ))

(defn StakeActivationData_-active "*
     * stake active during the epoch
     "  [this] (cljs.core/aget this "active" ))

(defn StakeActivationData_-inactive "*
     * stake inactive during the epoch
     "  [this] (cljs.core/aget this "inactive" ))

(def StakeActivationData {"state"  "*
     * the stake account's activation state
      \"active\"|\"inactive\"|\"activating\"|\"deactivating\"" ,
                          "active"  "*
     * stake active during the epoch
      `number`" ,
                          "inactive"  "*
     * stake inactive during the epoch
      `number`" })

(defn DataSlice_-offset "*
     * offset of data slice
     "  [this] (cljs.core/aget this "offset" ))

(defn DataSlice_-length "*
     * length of data slice
     "  [this] (cljs.core/aget this "length" ))

(def DataSlice {"offset"  "*
     * offset of data slice
      `number`" , "length"  "*
     * length of data slice
      `number`" })

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn MemcmpFilter_-memcmp ""  [this] (cljs.core/aget this "memcmp" ))

(def MemcmpFilter {"memcmp"  " `object`" })

(defn DataSizeFilter_-dataSize "*
     * Size of data for program account data length comparison
     "  [this] (cljs.core/aget this "dataSize" ))

(def DataSizeFilter {"dataSize"  "*
     * Size of data for program account data length comparison
      `number`" })

(def GetProgramAccountsFilter "`MemcmpFilter`<>|`DataSizeFilter`<>" )

(defn GetProgramAccountsConfig_-commitment "*
     * Optional commitment level
     "  [this] (cljs.core/aget this "commitment" ))

(defn GetProgramAccountsConfig_-encoding "*
     * Optional encoding for account data (default base64)
     * To use \"jsonParsed\" encoding, please refer to `getParsedProgramAccounts` in connection.ts
     "  [this] (cljs.core/aget this "encoding" ))

(defn GetProgramAccountsConfig_-dataSlice "*
     * Optional data slice to limit the returned account data
     "  [this] (cljs.core/aget this "dataSlice" ))

(defn GetProgramAccountsConfig_-filters "*
     * Optional array of filters to apply to accounts
     "  [this] (cljs.core/aget this "filters" ))

(def GetProgramAccountsConfig {"commitment"  "*
     * Optional commitment level
      `Commitment`<>" , "encoding"  "*
     * Optional encoding for account data (default base64)
     * To use \"jsonParsed\" encoding, please refer to `getParsedProgramAccounts` in connection.ts
      \"base64\"" , "dataSlice"  "*
     * Optional data slice to limit the returned account data
      `DataSlice`<>" , "filters"  "*
     * Optional array of filters to apply to accounts
      `ArrayTypeAnnotation`" })

(defn GetParsedProgramAccountsConfig_-commitment "*
     * Optional commitment level
     "  [this] (cljs.core/aget this "commitment" ))

(defn GetParsedProgramAccountsConfig_-filters "*
     * Optional array of filters to apply to accounts
     "  [this] (cljs.core/aget this "filters" ))

(def GetParsedProgramAccountsConfig {"commitment"  "*
     * Optional commitment level
      `Commitment`<>" , "filters"  "*
     * Optional array of filters to apply to accounts
      `ArrayTypeAnnotation`" })

(defn GetMultipleAccountsConfig_-commitment "*
     * Optional commitment level
     "  [this] (cljs.core/aget this "commitment" ))

(defn GetMultipleAccountsConfig_-encoding "*
     * Optional encoding for account data (default base64)
     "  [this] (cljs.core/aget this "encoding" ))

(def GetMultipleAccountsConfig {"commitment"  "*
     * Optional commitment level
      `Commitment`<>" , "encoding"  "*
     * Optional encoding for account data (default base64)
      \"base64\"|\"jsonParsed\"" })

(defn AccountInfo_-executable "*
     * `true` if this account's data contains a loaded program
     "  [this] (cljs.core/aget this "executable" ))

(defn AccountInfo_-owner "*
     * Identifier of the program that owns the account
     "  [this] (cljs.core/aget this "owner" ))

(defn AccountInfo_-lamports "*
     * Number of lamports assigned to the account
     "  [this] (cljs.core/aget this "lamports" ))

(defn AccountInfo_-data "*
     * Optional data assigned to the account
     "  [this] (cljs.core/aget this "data" ))

(defn AccountInfo_-rentEpoch "*
     * Optional rent epoch info for account
     "  [this] (cljs.core/aget this "rentEpoch" ))

(def AccountInfo {"executable"  "*
     * `true` if this account's data contains a loaded program
      `bool`" , "owner"  "*
     * Identifier of the program that owns the account
      `PublicKey`<>" , "lamports"  "*
     * Number of lamports assigned to the account
      `number`" , "data"  "*
     * Optional data assigned to the account
      `T`<>" , "rentEpoch"  "*
     * Optional rent epoch info for account
      `number`" })

(defn KeyedAccountInfo_-accountId
  "" 
  [this]
  (cljs.core/aget this "accountId" ))

(defn KeyedAccountInfo_-accountInfo
  "" 
  [this]
  (cljs.core/aget this "accountInfo" ))

(def KeyedAccountInfo
 {"accountId"  " `PublicKey`<>" ,
  "accountInfo"  " `AccountInfo`<`Buffer`<>>" })

(def AccountChangeCallback "`function`" )

(def ProgramAccountChangeCallback "`function`" )

(def SlotChangeCallback "`function`" )

(def SlotUpdateCallback "`function`" )

(def SignatureResultCallback "`function`" )

(defn SignatureStatusNotification_-type
  "" 
  [this]
  (cljs.core/aget this "type" ))

(defn SignatureStatusNotification_-result
  "" 
  [this]
  (cljs.core/aget this "result" ))

(def SignatureStatusNotification
 {"type"  " \"status\"" , "result"  " `SignatureResult`<>" })

(defn SignatureReceivedNotification_-type
  "" 
  [this]
  (cljs.core/aget this "type" ))

(def SignatureReceivedNotification {"type"  " \"received\"" })

(def SignatureSubscriptionCallback "`function`" )

(defn SignatureSubscriptionOptions_-commitment
  "" 
  [this]
  (cljs.core/aget this "commitment" ))

(defn SignatureSubscriptionOptions_-enableReceivedNotification
  "" 
  [this]
  (cljs.core/aget this "enableReceivedNotification" ))

(def SignatureSubscriptionOptions
 {"commitment"  " `Commitment`<>" ,
  "enableReceivedNotification"  " `bool`" })

(def RootChangeCallback "`function`" )

(defn Logs_-err ""  [this] (cljs.core/aget this "err" ))

(defn Logs_-logs ""  [this] (cljs.core/aget this "logs" ))

(defn Logs_-signature ""  [this] (cljs.core/aget this "signature" ))

(def Logs
 {"err"  " `TransactionError`<>|`NullLiteralTypeAnnotation`" ,
  "logs"  " `ArrayTypeAnnotation`" ,
  "signature"  " `string`" })

(def LogsFilter "`PublicKey`<>|\"all\"|\"allWithVotes\"" )

(def LogsCallback "`function`" )

(defn SignatureResult_-err ""  [this] (cljs.core/aget this "err" ))

(def SignatureResult
 {"err"  " `TransactionError`<>|`NullLiteralTypeAnnotation`" })

(def TransactionError "`object`|`string`" )

(def TransactionConfirmationStatus
 "\"processed\"|\"confirmed\"|\"finalized\"" )

(defn SignatureStatus_-slot "*
     * when the transaction was processed
     "  [this] (cljs.core/aget this "slot" ))

(defn SignatureStatus_-confirmations "*
     * the number of blocks that have been confirmed and voted on in the fork containing `slot`
     "  [this] (cljs.core/aget this "confirmations" ))

(defn SignatureStatus_-err "*
     * transaction error, if any
     "  [this] (cljs.core/aget this "err" ))

(defn SignatureStatus_-confirmationStatus "*
     * cluster confirmation status, if data available. Possible responses: `processed`, `confirmed`, `finalized`
     "  [this] (cljs.core/aget this "confirmationStatus" ))

(def SignatureStatus {"slot"  "*
     * when the transaction was processed
      `number`" , "confirmations"  "*
     * the number of blocks that have been confirmed and voted on in the fork containing `slot`
      `number`|`NullLiteralTypeAnnotation`" , "err"  "*
     * transaction error, if any
      `TransactionError`<>|`NullLiteralTypeAnnotation`" ,
                      "confirmationStatus"  "*
     * cluster confirmation status, if data available. Possible responses: `processed`, `confirmed`, `finalized`
      `TransactionConfirmationStatus`<>" })

(defn ConfirmedSignatureInfo_-signature "*
     * the transaction signature
     "  [this] (cljs.core/aget this "signature" ))

(defn ConfirmedSignatureInfo_-slot "*
     * when the transaction was processed
     "  [this] (cljs.core/aget this "slot" ))

(defn ConfirmedSignatureInfo_-err "*
     * error, if any
     "  [this] (cljs.core/aget this "err" ))

(defn ConfirmedSignatureInfo_-memo "*
     * memo associated with the transaction, if any
     "  [this] (cljs.core/aget this "memo" ))

(defn ConfirmedSignatureInfo_-blockTime "*
     * The unix timestamp of when the transaction was processed
     "  [this] (cljs.core/aget this "blockTime" ))

(def ConfirmedSignatureInfo {"signature"  "*
     * the transaction signature
      `string`" , "slot"  "*
     * when the transaction was processed
      `number`" , "err"  "*
     * error, if any
      `TransactionError`<>|`NullLiteralTypeAnnotation`" , "memo"  "*
     * memo associated with the transaction, if any
      `string`|`NullLiteralTypeAnnotation`" , "blockTime"  "*
     * The unix timestamp of when the transaction was processed
      `number`|`NullLiteralTypeAnnotation`" })

(def HttpHeaders {})

(def FetchMiddleware "`function`" )

(defn ConnectionConfig_-commitment "*
     * Optional commitment level
     "  [this] (cljs.core/aget this "commitment" ))

(defn ConnectionConfig_-wsEndpoint "*
     * Optional endpoint URL to the fullnode JSON RPC PubSub WebSocket Endpoint
     "  [this] (cljs.core/aget this "wsEndpoint" ))

(defn ConnectionConfig_-httpHeaders "*
     * Optional HTTP headers object
     "  [this] (cljs.core/aget this "httpHeaders" ))

(defn ConnectionConfig_-fetchMiddleware "*
     * Optional fetch middleware callback
     "  [this] (cljs.core/aget this "fetchMiddleware" ))

(defn ConnectionConfig_-disableRetryOnRateLimit "*
     * Optional Disable retring calls when server responds with HTTP 429 (Too Many Requests)
     "  [this] (cljs.core/aget this "disableRetryOnRateLimit" ))

(defn ConnectionConfig_-confirmTransactionInitialTimeout "*
     * time to allow for the server to initially process a transaction (in milliseconds)
     " 
  [this]
  (cljs.core/aget this "confirmTransactionInitialTimeout" ))

(def ConnectionConfig {"commitment"  "*
     * Optional commitment level
      `Commitment`<>" , "wsEndpoint"  "*
     * Optional endpoint URL to the fullnode JSON RPC PubSub WebSocket Endpoint
      `string`" , "httpHeaders"  "*
     * Optional HTTP headers object
      `HttpHeaders`<>" , "fetchMiddleware"  "*
     * Optional fetch middleware callback
      `FetchMiddleware`<>" , "disableRetryOnRateLimit"  "*
     * Optional Disable retring calls when server responds with HTTP 429 (Too Many Requests)
      `bool`" , "confirmTransactionInitialTimeout"  "*
     * time to allow for the server to initially process a transaction (in milliseconds)
      `number`" })

(def Connection
 {"getConfirmedBlockSignatures" 
  "method - `Connection_getConfirmedBlockSignatures`" ,
  "removeProgramAccountChangeListener" 
  "method - `Connection_removeProgramAccountChangeListener`" ,
  "getAccountInfoAndContext" 
  "method - `Connection_getAccountInfoAndContext`" ,
  "getBlocks"  "method - `Connection_getBlocks`" ,
  "getParsedTokenAccountsByOwner" 
  "method - `Connection_getParsedTokenAccountsByOwner`" ,
  "getSupply"  "method - `Connection_getSupply`" ,
  "getParsedProgramAccounts" 
  "method - `Connection_getParsedProgramAccounts`" ,
  "getEpochInfo"  "method - `Connection_getEpochInfo`" ,
  "removeOnLogsListener" 
  "method - `Connection_removeOnLogsListener`" ,
  "simulateTransaction"  "method - `Connection_simulateTransaction`" ,
  "getTokenAccountBalance" 
  "method - `Connection_getTokenAccountBalance`" ,
  "sendRawTransaction"  "method - `Connection_sendRawTransaction`" ,
  "getVoteAccounts"  "method - `Connection_getVoteAccounts`" ,
  "confirmTransaction"  "method - `Connection_confirmTransaction`" ,
  "getSignatureStatus"  "method - `Connection_getSignatureStatus`" ,
  "getTokenSupply"  "method - `Connection_getTokenSupply`" ,
  "getBlock"  "method - `Connection_getBlock`" ,
  "getFeeCalculatorForBlockhash" 
  "method - `Connection_getFeeCalculatorForBlockhash`" ,
  "getTransactionCount"  "method - `Connection_getTransactionCount`" ,
  "getConfirmedSignaturesForAddress" 
  "method - `Connection_getConfirmedSignaturesForAddress`" ,
  "onProgramAccountChange" 
  "method - `Connection_onProgramAccountChange`" ,
  "getNonceAndContext"  "method - `Connection_getNonceAndContext`" ,
  "onAccountChange"  "method - `Connection_onAccountChange`" ,
  "onSignatureWithOptions" 
  "method - `Connection_onSignatureWithOptions`" ,
  "getEpochSchedule"  "method - `Connection_getEpochSchedule`" ,
  "sendEncodedTransaction" 
  "method - `Connection_sendEncodedTransaction`" ,
  "removeSignatureListener" 
  "method - `Connection_removeSignatureListener`" ,
  "getParsedConfirmedTransaction" 
  "method - `Connection_getParsedConfirmedTransaction`" ,
  "_buildArgs"  "method - `Connection__buildArgs`" ,
  "onSlotChange"  "method - `Connection_onSlotChange`" ,
  "getMinimumBalanceForRentExemption" 
  "method - `Connection_getMinimumBalanceForRentExemption`" ,
  "removeAccountChangeListener" 
  "method - `Connection_removeAccountChangeListener`" ,
  "getFirstAvailableBlock" 
  "method - `Connection_getFirstAvailableBlock`" ,
  "getInflationReward"  "method - `Connection_getInflationReward`" ,
  "getBalance"  "method - `Connection_getBalance`" ,
  "getGenesisHash"  "method - `Connection_getGenesisHash`" ,
  "onRootChange"  "method - `Connection_onRootChange`" ,
  "removeSlotChangeListener" 
  "method - `Connection_removeSlotChangeListener`" ,
  "getTokenAccountsByOwner" 
  "method - `Connection_getTokenAccountsByOwner`" ,
  "getMinimumLedgerSlot" 
  "method - `Connection_getMinimumLedgerSlot`" ,
  "sendTransaction"  "method - `Connection_sendTransaction`" ,
  "getVersion"  "method - `Connection_getVersion`" ,
  "getTokenLargestAccounts" 
  "method - `Connection_getTokenLargestAccounts`" ,
  "getSignaturesForAddress" 
  "method - `Connection_getSignaturesForAddress`" ,
  "getConfirmedTransaction" 
  "method - `Connection_getConfirmedTransaction`" ,
  "getRecentBlockhashAndContext" 
  "method - `Connection_getRecentBlockhashAndContext`" ,
  "removeSlotUpdateListener" 
  "method - `Connection_removeSlotUpdateListener`" ,
  "getClusterNodes"  "method - `Connection_getClusterNodes`" ,
  "getFeeForMessage"  "method - `Connection_getFeeForMessage`" ,
  "getSlotLeader"  "method - `Connection_getSlotLeader`" ,
  "removeRootChangeListener" 
  "method - `Connection_removeRootChangeListener`" ,
  "getRecentPerformanceSamples" 
  "method - `Connection_getRecentPerformanceSamples`" ,
  "getAccountInfo"  "method - `Connection_getAccountInfo`" ,
  "commitment"  "*
     * The default commitment used for requests
      `Commitment`<>|`VoidTypeAnnotation`" ,
  "getSignatureStatuses" 
  "method - `Connection_getSignatureStatuses`" ,
  "getLeaderSchedule"  "method - `Connection_getLeaderSchedule`" ,
  "getTransaction"  "method - `Connection_getTransaction`" ,
  "getInflationGovernor" 
  "method - `Connection_getInflationGovernor`" ,
  "getBalanceAndContext" 
  "method - `Connection_getBalanceAndContext`" ,
  "requestAirdrop"  "method - `Connection_requestAirdrop`" ,
  "getBlockTime"  "method - `Connection_getBlockTime`" ,
  "onLogs"  "method - `Connection_onLogs`" ,
  "getStakeActivation"  "method - `Connection_getStakeActivation`" ,
  "getLargestAccounts"  "method - `Connection_getLargestAccounts`" ,
  "onSlotUpdate"  "method - `Connection_onSlotUpdate`" ,
  "onSignature"  "method - `Connection_onSignature`" ,
  "getParsedConfirmedTransactions" 
  "method - `Connection_getParsedConfirmedTransactions`" ,
  "getRecentBlockhash"  "method - `Connection_getRecentBlockhash`" ,
  "getParsedAccountInfo" 
  "method - `Connection_getParsedAccountInfo`" ,
  "getTotalSupply"  "method - `Connection_getTotalSupply`" ,
  "getConfirmedBlock"  "method - `Connection_getConfirmedBlock`" ,
  "getProgramAccounts"  "method - `Connection_getProgramAccounts`" ,
  "getNonce"  "method - `Connection_getNonce`" ,
  "getConfirmedSignaturesForAddress2" 
  "method - `Connection_getConfirmedSignaturesForAddress2`" ,
  "getSlot"  "method - `Connection_getSlot`" ,
  "getSlotLeaders"  "method - `Connection_getSlotLeaders`" ,
  "constructor"  "method - `Connection_constructor`" ,
  "getMultipleAccountsInfo" 
  "method - `Connection_getMultipleAccountsInfo`" })

(defn Connection_constructor "*
     * Establish a JSON RPC connection
     * -@param endpoint URL to the fullnode JSON RPC endpoint
     * -@param commitmentOrConfig optional default commitment level or optional ConnectionConfig configuration object
     
endpoint - `string`
commitmentOrConfig - `Commitment`<>|`ConnectionConfig`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Connection)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn Connection_-commitment "*
     * The default commitment used for requests
     "  [this] (cljs.core/aget this "commitment" ))

(defn Connection_getBalanceAndContext "*
     * Fetch the balance for the specified public key, return with context
     
publicKey - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`number`>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getBalanceAndContext" ) this)
    args))

(defn Connection_getBalance "*
     * Fetch the balance for the specified public key
     
publicKey - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`number`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getBalance" ) this) args))

(defn Connection_getBlockTime "*
     * Fetch the estimated production time of a block
     
slot - `number`


-@return -`Promise`<`number`|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getBlockTime" ) this) args))

(defn Connection_getMinimumLedgerSlot "*
     * Fetch the lowest slot that the node has information about in its ledger.
     * This value may increase over time if the node is configured to purge older ledger data
     


-@return -`Promise`<`number`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getMinimumLedgerSlot" ) this)
    args))

(defn Connection_getFirstAvailableBlock "*
     * Fetch the slot of the lowest confirmed block that has not been purged from the ledger
     


-@return -`Promise`<`number`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getFirstAvailableBlock" ) this)
    args))

(defn Connection_getSupply "*
     * Fetch information about the current supply
     
config - `GetSupplyConfig`<>|`Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`Supply`<>>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getSupply" ) this) args))

(defn Connection_getTokenSupply "*
     * Fetch the current supply of a token mint
     
tokenMintAddress - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`TokenAmount`<>>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getTokenSupply" ) this) args))

(defn Connection_getTokenAccountBalance "*
     * Fetch the current balance of a token account
     
tokenAddress - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`TokenAmount`<>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getTokenAccountBalance" ) this)
    args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getTokenAccountsByOwner "*
 * Fetch all the token accounts owned by the specified account
 * -@return {Promise<RpcResponseAndContext<Array<{
pubkey: PublicKey,
account: AccountInfo<Buffer>,...
}>>>}
 
ownerAddress - `PublicKey`<>
filter - `TokenAccountsFilter`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`Array`<`object`>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getTokenAccountsByOwner" ) this)
    args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getParsedTokenAccountsByOwner "*
 * Fetch parsed token accounts owned by the specified account
 * -@return {Promise<RpcResponseAndContext<Array<{
pubkey: PublicKey,
account: AccountInfo<ParsedAccountData>,...
}>>>}
 
ownerAddress - `PublicKey`<>
filter - `TokenAccountsFilter`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`Array`<`object`>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getParsedTokenAccountsByOwner" ) this)
    args))

(defn Connection_getLargestAccounts "*
     * Fetch the 20 largest accounts with their current balances
     
config - `GetLargestAccountsConfig`<>


-@return -`Promise`<`RpcResponseAndContext`<`Array`<`AccountBalancePair`<>>>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getLargestAccounts" ) this) args))

(defn Connection_getTokenLargestAccounts "*
     * Fetch the 20 largest token accounts with their current balances
     * for a given mint.
     
mintAddress - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`Array`<`TokenAccountBalancePair`<>>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getTokenLargestAccounts" ) this)
    args))

(defn Connection_getAccountInfoAndContext "*
     * Fetch all the account info for the specified public key, return with context
     
publicKey - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`AccountInfo`<`Buffer`<>>|`NullLiteralTypeAnnotation`>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getAccountInfoAndContext" ) this)
    args))

(defn Connection_getParsedAccountInfo "*
     * Fetch parsed account info for the specified public key
     
publicKey - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`AccountInfo`<`Buffer`<>|`ParsedAccountData`<>>|`NullLiteralTypeAnnotation`>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getParsedAccountInfo" ) this)
    args))

(defn Connection_getAccountInfo "*
     * Fetch all the account info for the specified public key
     
publicKey - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`AccountInfo`<`Buffer`<>>|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getAccountInfo" ) this) args))

(defn Connection_getMultipleAccountsInfo "*
     * Fetch all the account info for multiple accounts specified by an array of public keys
     
publicKeys - `ArrayTypeAnnotation`
configOrCommitment - `GetMultipleAccountsConfig`<>|`Commitment`<>


-@return -`Promise`<`ArrayTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getMultipleAccountsInfo" ) this)
    args))

(defn Connection_getStakeActivation "*
     * Returns epoch activation information for a stake account that has been delegated
     
publicKey - `PublicKey`<>
commitment - `Commitment`<>
epoch - `number`


-@return -`Promise`<`StakeActivationData`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getStakeActivation" ) this) args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getProgramAccounts "*
 * Fetch all the accounts owned by the specified program id
 * -@return {Promise<Array<{
pubkey: PublicKey,
account: AccountInfo<Buffer>,...
}>>}
 
programId - `PublicKey`<>
configOrCommitment - `GetProgramAccountsConfig`<>|`Commitment`<>


-@return -`Promise`<`Array`<`object`>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getProgramAccounts" ) this) args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getParsedProgramAccounts "*
 * Fetch and parse all the accounts owned by the specified program id
 * -@return {Promise<Array<{
pubkey: PublicKey,
account: AccountInfo<Buffer | ParsedAccountData>,...
}>>}
 
programId - `PublicKey`<>
configOrCommitment - `GetParsedProgramAccountsConfig`<>|`Commitment`<>


-@return -`Promise`<`Array`<`object`>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getParsedProgramAccounts" ) this)
    args))

(defn Connection_confirmTransaction "*
     * Confirm the transaction identified by the specified signature.
     
signature - `TransactionSignature`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`SignatureResult`<>>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "confirmTransaction" ) this) args))

(defn Connection_getClusterNodes "*
     * Return the list of nodes that are currently participating in the cluster
     


-@return -`Promise`<`Array`<`ContactInfo`<>>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getClusterNodes" ) this) args))

(defn Connection_getVoteAccounts "*
     * Return the list of nodes that are currently participating in the cluster
     
commitment - `Commitment`<>


-@return -`Promise`<`VoteAccountStatus`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getVoteAccounts" ) this) args))

(defn Connection_getSlot "*
     * Fetch the current slot that the node is processing
     
commitment - `Commitment`<>


-@return -`Promise`<`number`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getSlot" ) this) args))

(defn Connection_getSlotLeader "*
     * Fetch the current slot leader of the cluster
     
commitment - `Commitment`<>


-@return -`Promise`<`string`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getSlotLeader" ) this) args))

(defn Connection_getSlotLeaders "*
     * Fetch `limit` number of slot leaders starting from `startSlot`
     * -@param startSlot fetch slot leaders starting from this slot
     * -@param limit number of slot leaders to return
     
startSlot - `number`
limit - `number`


-@return -`Promise`<`Array`<`PublicKey`<>>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getSlotLeaders" ) this) args))

(defn Connection_getSignatureStatus "*
     * Fetch the current status of a signature
     
signature - `TransactionSignature`<>
config - `SignatureStatusConfig`<>


-@return -`Promise`<`RpcResponseAndContext`<`SignatureStatus`<>|`NullLiteralTypeAnnotation`>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getSignatureStatus" ) this) args))

(defn Connection_getSignatureStatuses "*
     * Fetch the current statuses of a batch of signatures
     
signatures - `Array`<`TransactionSignature`<>>
config - `SignatureStatusConfig`<>


-@return -`Promise`<`RpcResponseAndContext`<`Array`<`SignatureStatus`<>|`NullLiteralTypeAnnotation`>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getSignatureStatuses" ) this)
    args))

(defn Connection_getTransactionCount "*
     * Fetch the current transaction count of the cluster
     
commitment - `Commitment`<>


-@return -`Promise`<`number`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getTransactionCount" ) this)
    args))

(defn Connection_getTotalSupply "*
     * Fetch the current total currency supply of the cluster in lamports
     * -@deprecated [object Object],[object Object],[object Object]
     
commitment - `Commitment`<>


-@return -`Promise`<`number`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getTotalSupply" ) this) args))

(defn Connection_getInflationGovernor "*
     * Fetch the cluster InflationGovernor parameters
     
commitment - `Commitment`<>


-@return -`Promise`<`InflationGovernor`<>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getInflationGovernor" ) this)
    args))

(defn Connection_getInflationReward "*
     * Fetch the inflation reward for a list of addresses for an epoch
     
addresses - `ArrayTypeAnnotation`
epoch - `number`
commitment - `Commitment`<>


-@return -`Promise`<`ArrayTypeAnnotation`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getInflationReward" ) this) args))

(defn Connection_getEpochInfo "*
     * Fetch the Epoch Info parameters
     
commitment - `Commitment`<>


-@return -`Promise`<`EpochInfo`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getEpochInfo" ) this) args))

(defn Connection_getEpochSchedule "*
     * Fetch the Epoch Schedule parameters
     


-@return -`Promise`<`EpochSchedule`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getEpochSchedule" ) this) args))

(defn Connection_getLeaderSchedule "*
     * Fetch the leader schedule for the current epoch
     * -@return {Promise<RpcResponseAndContext<LeaderSchedule>>}
     


-@return -`Promise`<`LeaderSchedule`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getLeaderSchedule" ) this) args))

(defn Connection_getMinimumBalanceForRentExemption "*
     * Fetch the minimum balance needed to exempt an account of `dataLength`
     * size from rent
     
dataLength - `number`
commitment - `Commitment`<>


-@return -`Promise`<`number`>"
  [this & args]
  (apply
    (.bind
      (cljs.core/aget this "getMinimumBalanceForRentExemption" )
      this)
    args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getRecentBlockhashAndContext "*
 * Fetch a recent blockhash from the cluster, return with context
 * -@return {Promise<RpcResponseAndContext<{
blockhash: Blockhash,
feeCalculator: FeeCalculator,...
}>>}
 
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`object`>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getRecentBlockhashAndContext" ) this)
    args))

(defn Connection_getRecentPerformanceSamples "*
     * Fetch recent performance samples
     * -@return {Promise<Array<PerfSample>>}
     
limit - `number`


-@return -`Promise`<`Array`<`PerfSample`<>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getRecentPerformanceSamples" ) this)
    args))

(defn Connection_getFeeCalculatorForBlockhash "*
     * Fetch the fee calculator for a recent blockhash from the cluster, return with context
     
blockhash - `Blockhash`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`FeeCalculator`<>|`NullLiteralTypeAnnotation`>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getFeeCalculatorForBlockhash" ) this)
    args))

(defn Connection_getFeeForMessage "*
     * Fetch the fee for a message from the cluster, return with context
     
message - `Message`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`number`>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getFeeForMessage" ) this) args))

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getRecentBlockhash "*
 * Fetch a recent blockhash from the cluster
 * -@return {Promise<{
blockhash: Blockhash,
feeCalculator: FeeCalculator,...
}>}
 
commitment - `Commitment`<>


-@return -`Promise`<`object`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getRecentBlockhash" ) this) args))

(defn Connection_getVersion "*
     * Fetch the node version
     


-@return -`Promise`<`Version`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getVersion" ) this) args))

(defn Connection_getGenesisHash "*
     * Fetch the genesis hash
     


-@return -`Promise`<`string`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getGenesisHash" ) this) args))

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getBlock "*
     * Fetch a processed block from the cluster.
     
slot - `number`
opts - `object`


-@return -`Promise`<`BlockResponse`<>|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getBlock" ) this) args))

(cljs.core/comment "can only make function currently!!" )

(defn Connection_getTransaction "*
     * Fetch a processed transaction from the cluster.
     
signature - `string`
opts - `object`


-@return -`Promise`<`TransactionResponse`<>|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getTransaction" ) this) args))

(defn Connection_getConfirmedBlock "*
     * Fetch a list of Transactions and transaction statuses from the cluster
     * for a confirmed block.
     * -@deprecated [object Object],[object Object],[object Object]
     
slot - `number`
commitment - `Finality`<>


-@return -`Promise`<`ConfirmedBlock`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getConfirmedBlock" ) this) args))

(defn Connection_getBlocks "*
     * Fetch confirmed blocks between two slots
     
startSlot - `number`
endSlot - `number`
commitment - `Finality`<>


-@return -`Promise`<`Array`<`number`>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getBlocks" ) this) args))

(defn Connection_getConfirmedBlockSignatures "*
     * Fetch a list of Signatures from the cluster for a confirmed block, excluding rewards
     
slot - `number`
commitment - `Finality`<>


-@return -`Promise`<`ConfirmedBlockSignatures`<>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getConfirmedBlockSignatures" ) this)
    args))

(defn Connection_getConfirmedTransaction "*
     * Fetch a transaction details for a confirmed transaction
     
signature - `TransactionSignature`<>
commitment - `Finality`<>


-@return -`Promise`<`ConfirmedTransaction`<>|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getConfirmedTransaction" ) this)
    args))

(defn Connection_getParsedConfirmedTransaction "*
     * Fetch parsed transaction details for a confirmed transaction
     
signature - `TransactionSignature`<>
commitment - `Finality`<>


-@return -`Promise`<`ParsedConfirmedTransaction`<>|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getParsedConfirmedTransaction" ) this)
    args))

(defn Connection_getParsedConfirmedTransactions "*
     * Fetch parsed transaction details for a batch of confirmed transactions
     
signatures - `ArrayTypeAnnotation`
commitment - `Finality`<>


-@return -`Promise`<`ArrayTypeAnnotation`>"
  [this & args]
  (apply
    (.bind
      (cljs.core/aget this "getParsedConfirmedTransactions" )
      this)
    args))

(defn Connection_getConfirmedSignaturesForAddress "*
     * Fetch a list of all the confirmed signatures for transactions involving an address
     * within a specified slot range. Max range allowed is 10,000 slots.
     * -@deprecated [object Object],[object Object],[object Object]
     * -@param address queried address
     * -@param startSlot start slot, inclusive
     * -@param endSlot end slot, inclusive
     
address - `PublicKey`<>
startSlot - `number`
endSlot - `number`


-@return -`Promise`<`Array`<`TransactionSignature`<>>>"
  [this & args]
  (apply
    (.bind
      (cljs.core/aget this "getConfirmedSignaturesForAddress" )
      this)
    args))

(defn Connection_getConfirmedSignaturesForAddress2 "*
     * Returns confirmed signatures for transactions involving an
     * address backwards in time from the provided signature or most recent confirmed block
     * -@param address queried address
     * -@param options
     
address - `PublicKey`<>
options - `ConfirmedSignaturesForAddress2Options`<>
commitment - `Finality`<>


-@return -`Promise`<`Array`<`ConfirmedSignatureInfo`<>>>"
  [this & args]
  (apply
    (.bind
      (cljs.core/aget this "getConfirmedSignaturesForAddress2" )
      this)
    args))

(defn Connection_getSignaturesForAddress "*
     * Returns confirmed signatures for transactions involving an
     * address backwards in time from the provided signature or most recent confirmed block
     * -@param address queried address
     * -@param options
     
address - `PublicKey`<>
options - `SignaturesForAddressOptions`<>
commitment - `Finality`<>


-@return -`Promise`<`Array`<`ConfirmedSignatureInfo`<>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "getSignaturesForAddress" ) this)
    args))

(defn Connection_getNonceAndContext "*
     * Fetch the contents of a Nonce account from the cluster, return with context
     
nonceAccount - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`RpcResponseAndContext`<`NonceAccount`<>|`NullLiteralTypeAnnotation`>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getNonceAndContext" ) this) args))

(defn Connection_getNonce "*
     * Fetch the contents of a Nonce account from the cluster
     
nonceAccount - `PublicKey`<>
commitment - `Commitment`<>


-@return -`Promise`<`NonceAccount`<>|`NullLiteralTypeAnnotation`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "getNonce" ) this) args))

(defn Connection_requestAirdrop "*
     * Request an allocation of lamports to the specified address
     *
     * ```typescript
     * import { Connection, PublicKey, LAMPORTS_PER_SOL } from \"-@solana/web3.js\";
     *
     * (async () => {
     *   const connection = new Connection(\"https://api.testnet.solana.com\", \"confirmed\");
     *   const myAddress = new PublicKey(\"2nr1bHFT86W9tGnyvmYW4vcHKsQB3sVQfnddasz4kExM\");
     *   const signature = await connection.requestAirdrop(myAddress, LAMPORTS_PER_SOL);
     *   await connection.confirmTransaction(signature);
     * })();
     * ```
     
to - `PublicKey`<>
lamports - `number`


-@return -`Promise`<`TransactionSignature`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "requestAirdrop" ) this) args))

(defn Connection_simulateTransaction "*
     * Simulate a transaction
     
transactionOrMessage - `Transaction`<>|`Message`<>
signers - `Array`<`Signer`<>>
includeAccounts - `bool`|`Array`<`PublicKey`<>>


-@return -`Promise`<`RpcResponseAndContext`<`SimulatedTransactionResponse`<>>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "simulateTransaction" ) this)
    args))

(defn Connection_sendTransaction "*
     * Sign and send a transaction
     
transaction - `Transaction`<>
signers - `Array`<`Signer`<>>
options - `SendOptions`<>


-@return -`Promise`<`TransactionSignature`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "sendTransaction" ) this) args))

(defn Connection_sendRawTransaction "*
     * Send a transaction that has already been signed and serialized into the
     * wire format
     
rawTransaction - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>
options - `SendOptions`<>


-@return -`Promise`<`TransactionSignature`<>>"
  [this & args]
  (apply (.bind (cljs.core/aget this "sendRawTransaction" ) this) args))

(defn Connection_sendEncodedTransaction "*
     * Send a transaction that has already been signed, serialized into the
     * wire format, and encoded as a base64 string
     
encodedTransaction - `string`
options - `SendOptions`<>


-@return -`Promise`<`TransactionSignature`<>>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "sendEncodedTransaction" ) this)
    args))

(defn Connection_onAccountChange "*
     * Register a callback to be invoked whenever the specified account changes
     * -@param publicKey Public key of the account to monitor
     * -@param callback Function to invoke whenever the account is changed
     * -@param commitment Specify the commitment level account changes must reach before notification
     * -@return subscription id
     
publicKey - `PublicKey`<>
callback - `AccountChangeCallback`<>
commitment - `Commitment`<>


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "onAccountChange" ) this) args))

(defn Connection_removeAccountChangeListener "*
     * Deregister an account notification callback
     * -@param id subscription id to deregister
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "removeAccountChangeListener" ) this)
    args))

(defn Connection_onProgramAccountChange "*
     * Register a callback to be invoked whenever accounts owned by the
     * specified program change
     * -@param programId Public key of the program to monitor
     * -@param callback Function to invoke whenever the account is changed
     * -@param commitment Specify the commitment level account changes must reach before notification
     * -@param filters The program account filters to pass into the RPC method
     * -@return subscription id
     
programId - `PublicKey`<>
callback - `ProgramAccountChangeCallback`<>
commitment - `Commitment`<>
filters - `ArrayTypeAnnotation`


-@return -`number`"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "onProgramAccountChange" ) this)
    args))

(defn Connection_removeProgramAccountChangeListener "*
     * Deregister an account notification callback
     * -@param id subscription id to deregister
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind
      (cljs.core/aget this "removeProgramAccountChangeListener" )
      this)
    args))

(defn Connection_onLogs "*
     * Registers a callback to be invoked whenever logs are emitted.
     
filter - `LogsFilter`<>
callback - `LogsCallback`<>
commitment - `Commitment`<>


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "onLogs" ) this) args))

(defn Connection_removeOnLogsListener "*
     * Deregister a logs callback.
     * -@param id subscription id to deregister.
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "removeOnLogsListener" ) this)
    args))

(defn Connection_onSlotChange "*
     * Register a callback to be invoked upon slot changes
     * -@param callback Function to invoke whenever the slot changes
     * -@return subscription id
     
callback - `SlotChangeCallback`<>


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "onSlotChange" ) this) args))

(defn Connection_removeSlotChangeListener "*
     * Deregister a slot notification callback
     * -@param id subscription id to deregister
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "removeSlotChangeListener" ) this)
    args))

(defn Connection_onSlotUpdate "*
     * [object Object],[object Object],[object Object]
     * -@param callback Function to invoke whenever the slot updates
     * -@return subscription id
     
callback - `SlotUpdateCallback`<>


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "onSlotUpdate" ) this) args))

(defn Connection_removeSlotUpdateListener "*
     * Deregister a slot update notification callback
     * -@param id subscription id to deregister
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "removeSlotUpdateListener" ) this)
    args))

(defn Connection__buildArgs "
args - `Array`<`any`>
override - `Commitment`<>
encoding - \"jsonParsed\"|\"base64\"
extra - `any`


-@return -`Array`<`any`>"
  [this & args]
  (apply (.bind (cljs.core/aget this "_buildArgs" ) this) args))

(defn Connection_onSignature "*
     * Register a callback to be invoked upon signature updates
     * -@param signature Transaction signature string in base 58
     * -@param callback Function to invoke on signature notifications
     * -@param commitment Specify the commitment level signature must reach before notification
     * -@return subscription id
     
signature - `TransactionSignature`<>
callback - `SignatureResultCallback`<>
commitment - `Commitment`<>


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "onSignature" ) this) args))

(defn Connection_onSignatureWithOptions "*
     * Register a callback to be invoked when a transaction is
     * received and/or processed.
     * -@param signature Transaction signature string in base 58
     * -@param callback Function to invoke on signature notifications
     * -@param options Enable received notifications and set the commitment
     * level that signature must reach before notification
     * -@return subscription id
     
signature - `TransactionSignature`<>
callback - `SignatureSubscriptionCallback`<>
options - `SignatureSubscriptionOptions`<>


-@return -`number`"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "onSignatureWithOptions" ) this)
    args))

(defn Connection_removeSignatureListener "*
     * Deregister a signature notification callback
     * -@param id subscription id to deregister
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "removeSignatureListener" ) this)
    args))

(defn Connection_onRootChange "*
     * Register a callback to be invoked upon root changes
     * -@param callback Function to invoke whenever the root changes
     * -@return subscription id
     
callback - `RootChangeCallback`<>


-@return -`number`"
  [this & args]
  (apply (.bind (cljs.core/aget this "onRootChange" ) this) args))

(defn Connection_removeRootChangeListener "*
     * Deregister a root notification callback
     * -@param id subscription id to deregister
     
id - `number`


-@return -`Promise`<`VoidTypeAnnotation`>"
  [this & args]
  (apply
    (.bind (cljs.core/aget this "removeRootChangeListener" ) this)
    args))

(def BpfLoader
 {"getMinNumSignatures"  "method - `BpfLoader_getMinNumSignatures`" ,
  "load"  "method - `BpfLoader_load`" })

(defn BpfLoader_getMinNumSignatures "*
     * Minimum number of signatures required to load a program not including
     * retries
     *
     * Can be used to calculate transaction fees
     
dataLength - `number`


-@return -`number`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -BpfLoader
       -getMinNumSignatures)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -BpfLoader))
    args))

(defn BpfLoader_load "*
     * Load a BPF program
     * -@param connection The connection to use
     * -@param payer Account that will pay program loading fees
     * -@param program Account to load the program into
     * -@param elf The entire ELF containing the BPF program
     * -@param loaderProgramId The program id of the BPF loader to use
     * -@return true if program was loaded successfully, false if program was already loaded
     
connection - `Connection`<>
payer - `Signer`<>
program - `Signer`<>
elf - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>
loaderProgramId - `PublicKey`<>


-@return -`Promise`<`bool`>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -BpfLoader
       -load)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -BpfLoader))
    args))

(defn CreateEd25519InstructionWithPublicKeyParams_-publicKey
  "" 
  [this]
  (cljs.core/aget this "publicKey" ))

(defn CreateEd25519InstructionWithPublicKeyParams_-message
  "" 
  [this]
  (cljs.core/aget this "message" ))

(defn CreateEd25519InstructionWithPublicKeyParams_-signature
  "" 
  [this]
  (cljs.core/aget this "signature" ))

(defn CreateEd25519InstructionWithPublicKeyParams_-instructionIndex
  "" 
  [this]
  (cljs.core/aget this "instructionIndex" ))

(def CreateEd25519InstructionWithPublicKeyParams
 {"publicKey"  " `Uint8Array`<>" ,
  "message"  " `Uint8Array`<>" ,
  "signature"  " `Uint8Array`<>" ,
  "instructionIndex"  " `number`" })

(defn CreateEd25519InstructionWithPrivateKeyParams_-privateKey
  "" 
  [this]
  (cljs.core/aget this "privateKey" ))

(defn CreateEd25519InstructionWithPrivateKeyParams_-message
  "" 
  [this]
  (cljs.core/aget this "message" ))

(defn CreateEd25519InstructionWithPrivateKeyParams_-instructionIndex
  "" 
  [this]
  (cljs.core/aget this "instructionIndex" ))

(def CreateEd25519InstructionWithPrivateKeyParams
 {"privateKey"  " `Uint8Array`<>" ,
  "message"  " `Uint8Array`<>" ,
  "instructionIndex"  " `number`" })

(def Ed25519Program {"programId"  "*
     * Public key that identifies the ed25519 program
      `PublicKey`<>" ,
                     "createInstructionWithPublicKey" 
                     "method - `Ed25519Program_createInstructionWithPublicKey`" ,
                     "createInstructionWithPrivateKey" 
                     "method - `Ed25519Program_createInstructionWithPrivateKey`" })

(cljs.core/comment "can only make function currently!!" )

(defn Ed25519Program_createInstructionWithPublicKey "*
     * Create an ed25519 instruction with a public key and signature. The
     * public key must be a buffer that is 32 bytes long, and the signature
     * must be a buffer of 64 bytes.
     
params - `CreateEd25519InstructionWithPublicKeyParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Ed25519Program
       -createInstructionWithPublicKey)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Ed25519Program))
    args))

(defn Ed25519Program_createInstructionWithPrivateKey "*
     * Create an ed25519 instruction with a private key. The private key
     * must be a buffer that is 64 bytes long.
     
params - `CreateEd25519InstructionWithPrivateKeyParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Ed25519Program
       -createInstructionWithPrivateKey)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Ed25519Program))
    args))

(def Loader {"chunkSize"  "*
     * Amount of program data placed in each load Transaction
      `number`" ,
             "getMinNumSignatures" 
             "method - `Loader_getMinNumSignatures`" ,
             "load"  "method - `Loader_load`" })

(cljs.core/comment "can only make function currently!!" )

(defn Loader_getMinNumSignatures "*
     * Minimum number of signatures required to load a program not including
     * retries
     *
     * Can be used to calculate transaction fees
     
dataLength - `number`


-@return -`number`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Loader
       -getMinNumSignatures)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Loader))
    args))

(defn Loader_load "*
     * Loads a generic program
     * -@param connection The connection to use
     * -@param payer System account that pays to load the program
     * -@param program Account to load the program into
     * -@param programId Public key that identifies the loader
     * -@param data Program octets
     * -@return true if program was loaded successfully, false if program was already loaded
     
connection - `Connection`<>
payer - `Signer`<>
program - `Signer`<>
programId - `PublicKey`<>
data - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`Promise`<`bool`>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Loader
       -load)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Loader))
    args))

(def Authorized {"staker"  "*
     * stake authority
      `PublicKey`<>" , "withdrawer"  "*
     * withdraw authority
      `PublicKey`<>" ,
                 "constructor"  "method - `Authorized_constructor`" })

(defn Authorized_-staker "*
     * stake authority
     "  [this] (cljs.core/aget this "staker" ))

(defn Authorized_-withdrawer "*
     * withdraw authority
     "  [this] (cljs.core/aget this "withdrawer" ))

(defn Authorized_constructor "*
     * Create a new Authorized object
     * -@param staker the stake authority
     * -@param withdrawer the withdraw authority
     
staker - `PublicKey`<>
withdrawer - `PublicKey`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Authorized)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(def Lockup {"unixTimestamp"  "*
     * Unix timestamp of lockup expiration
      `number`" , "epoch"  "*
     * Epoch of lockup expiration
      `number`" , "custodian"  "*
     * Lockup custodian authority
      `PublicKey`<>" ,
             "constructor"  "method - `Lockup_constructor`" ,
             "default"  "*
     * Default, inactive Lockup value
      `Lockup`<>" })

(defn Lockup_-unixTimestamp "*
     * Unix timestamp of lockup expiration
     "  [this] (cljs.core/aget this "unixTimestamp" ))

(defn Lockup_-epoch "*
     * Epoch of lockup expiration
     "  [this] (cljs.core/aget this "epoch" ))

(defn Lockup_-custodian "*
     * Lockup custodian authority
     "  [this] (cljs.core/aget this "custodian" ))

(defn Lockup_constructor "*
     * Create a new Lockup object
     
unixTimestamp - `number`
epoch - `number`
custodian - `PublicKey`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -Lockup)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(cljs.core/comment "can only make function currently!!" )

(defn CreateStakeAccountParams_-fromPubkey "*
     * Address of the account which will fund creation
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn CreateStakeAccountParams_-stakePubkey "*
     * Address of the new stake account
     "  [this] (cljs.core/aget this "stakePubkey" ))

(defn CreateStakeAccountParams_-authorized "*
     * Authorities of the new stake account
     "  [this] (cljs.core/aget this "authorized" ))

(defn CreateStakeAccountParams_-lockup "*
     * Lockup of the new stake account
     "  [this] (cljs.core/aget this "lockup" ))

(defn CreateStakeAccountParams_-lamports "*
     * Funding amount
     "  [this] (cljs.core/aget this "lamports" ))

(def CreateStakeAccountParams {"fromPubkey"  "*
     * Address of the account which will fund creation
      `PublicKey`<>" , "stakePubkey"  "*
     * Address of the new stake account
      `PublicKey`<>" , "authorized"  "*
     * Authorities of the new stake account
      `Authorized`<>" , "lockup"  "*
     * Lockup of the new stake account
      `Lockup`<>" , "lamports"  "*
     * Funding amount
      `number`" })

(defn CreateStakeAccountWithSeedParams_-fromPubkey
  "" 
  [this]
  (cljs.core/aget this "fromPubkey" ))

(defn CreateStakeAccountWithSeedParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn CreateStakeAccountWithSeedParams_-basePubkey
  "" 
  [this]
  (cljs.core/aget this "basePubkey" ))

(defn CreateStakeAccountWithSeedParams_-seed
  "" 
  [this]
  (cljs.core/aget this "seed" ))

(defn CreateStakeAccountWithSeedParams_-authorized
  "" 
  [this]
  (cljs.core/aget this "authorized" ))

(defn CreateStakeAccountWithSeedParams_-lockup
  "" 
  [this]
  (cljs.core/aget this "lockup" ))

(defn CreateStakeAccountWithSeedParams_-lamports
  "" 
  [this]
  (cljs.core/aget this "lamports" ))

(def CreateStakeAccountWithSeedParams
 {"fromPubkey"  " `PublicKey`<>" ,
  "stakePubkey"  " `PublicKey`<>" ,
  "basePubkey"  " `PublicKey`<>" ,
  "seed"  " `string`" ,
  "authorized"  " `Authorized`<>" ,
  "lockup"  " `Lockup`<>" ,
  "lamports"  " `number`" })

(defn InitializeStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn InitializeStakeParams_-authorized
  "" 
  [this]
  (cljs.core/aget this "authorized" ))

(defn InitializeStakeParams_-lockup
  "" 
  [this]
  (cljs.core/aget this "lockup" ))

(def InitializeStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorized"  " `Authorized`<>" ,
  "lockup"  " `Lockup`<>" })

(defn DelegateStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn DelegateStakeParams_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(defn DelegateStakeParams_-votePubkey
  "" 
  [this]
  (cljs.core/aget this "votePubkey" ))

(def DelegateStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorizedPubkey"  " `PublicKey`<>" ,
  "votePubkey"  " `PublicKey`<>" })

(defn AuthorizeStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn AuthorizeStakeParams_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(defn AuthorizeStakeParams_-newAuthorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "newAuthorizedPubkey" ))

(defn AuthorizeStakeParams_-stakeAuthorizationType
  "" 
  [this]
  (cljs.core/aget this "stakeAuthorizationType" ))

(defn AuthorizeStakeParams_-custodianPubkey
  "" 
  [this]
  (cljs.core/aget this "custodianPubkey" ))

(def AuthorizeStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorizedPubkey"  " `PublicKey`<>" ,
  "newAuthorizedPubkey"  " `PublicKey`<>" ,
  "stakeAuthorizationType"  " `StakeAuthorizationType`<>" ,
  "custodianPubkey"  " `PublicKey`<>" })

(defn AuthorizeWithSeedStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn AuthorizeWithSeedStakeParams_-authorityBase
  "" 
  [this]
  (cljs.core/aget this "authorityBase" ))

(defn AuthorizeWithSeedStakeParams_-authoritySeed
  "" 
  [this]
  (cljs.core/aget this "authoritySeed" ))

(defn AuthorizeWithSeedStakeParams_-authorityOwner
  "" 
  [this]
  (cljs.core/aget this "authorityOwner" ))

(defn AuthorizeWithSeedStakeParams_-newAuthorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "newAuthorizedPubkey" ))

(defn AuthorizeWithSeedStakeParams_-stakeAuthorizationType
  "" 
  [this]
  (cljs.core/aget this "stakeAuthorizationType" ))

(defn AuthorizeWithSeedStakeParams_-custodianPubkey
  "" 
  [this]
  (cljs.core/aget this "custodianPubkey" ))

(def AuthorizeWithSeedStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorityBase"  " `PublicKey`<>" ,
  "authoritySeed"  " `string`" ,
  "authorityOwner"  " `PublicKey`<>" ,
  "newAuthorizedPubkey"  " `PublicKey`<>" ,
  "stakeAuthorizationType"  " `StakeAuthorizationType`<>" ,
  "custodianPubkey"  " `PublicKey`<>" })

(defn SplitStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn SplitStakeParams_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(defn SplitStakeParams_-splitStakePubkey
  "" 
  [this]
  (cljs.core/aget this "splitStakePubkey" ))

(defn SplitStakeParams_-lamports
  "" 
  [this]
  (cljs.core/aget this "lamports" ))

(def SplitStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorizedPubkey"  " `PublicKey`<>" ,
  "splitStakePubkey"  " `PublicKey`<>" ,
  "lamports"  " `number`" })

(defn WithdrawStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn WithdrawStakeParams_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(defn WithdrawStakeParams_-toPubkey
  "" 
  [this]
  (cljs.core/aget this "toPubkey" ))

(defn WithdrawStakeParams_-lamports
  "" 
  [this]
  (cljs.core/aget this "lamports" ))

(defn WithdrawStakeParams_-custodianPubkey
  "" 
  [this]
  (cljs.core/aget this "custodianPubkey" ))

(def WithdrawStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorizedPubkey"  " `PublicKey`<>" ,
  "toPubkey"  " `PublicKey`<>" ,
  "lamports"  " `number`" ,
  "custodianPubkey"  " `PublicKey`<>" })

(defn DeactivateStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn DeactivateStakeParams_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(def DeactivateStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "authorizedPubkey"  " `PublicKey`<>" })

(defn MergeStakeParams_-stakePubkey
  "" 
  [this]
  (cljs.core/aget this "stakePubkey" ))

(defn MergeStakeParams_-sourceStakePubKey
  "" 
  [this]
  (cljs.core/aget this "sourceStakePubKey" ))

(defn MergeStakeParams_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(def MergeStakeParams
 {"stakePubkey"  " `PublicKey`<>" ,
  "sourceStakePubKey"  " `PublicKey`<>" ,
  "authorizedPubkey"  " `PublicKey`<>" })

(def StakeInstruction
 {"decodeMerge"  "method - `StakeInstruction_decodeMerge`" ,
  "decodeWithdraw"  "method - `StakeInstruction_decodeWithdraw`" ,
  "decodeInstructionType" 
  "method - `StakeInstruction_decodeInstructionType`" ,
  "decodeDeactivate"  "method - `StakeInstruction_decodeDeactivate`" ,
  "decodeSplit"  "method - `StakeInstruction_decodeSplit`" ,
  "decodeInitialize"  "method - `StakeInstruction_decodeInitialize`" ,
  "decodeDelegate"  "method - `StakeInstruction_decodeDelegate`" ,
  "decodeAuthorize"  "method - `StakeInstruction_decodeAuthorize`" ,
  "decodeAuthorizeWithSeed" 
  "method - `StakeInstruction_decodeAuthorizeWithSeed`" })

(defn StakeInstruction_decodeInstructionType "*
     * Decode a stake instruction and retrieve the instruction type.
     
instruction - `TransactionInstruction`<>


-@return -`StakeInstructionType`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeInstructionType)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeInitialize "*
     * Decode a initialize stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`InitializeStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeInitialize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeDelegate "*
     * Decode a delegate stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`DelegateStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeDelegate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeAuthorize "*
     * Decode an authorize stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AuthorizeStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeAuthorize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeAuthorizeWithSeed "*
     * Decode an authorize-with-seed stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AuthorizeWithSeedStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeAuthorizeWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeSplit "*
     * Decode a split stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`SplitStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeSplit)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeMerge "*
     * Decode a merge stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`MergeStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeMerge)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeWithdraw "*
     * Decode a withdraw stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`WithdrawStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeWithdraw)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(defn StakeInstruction_decodeDeactivate "*
     * Decode a deactivate stake instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`DeactivateStakeParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction
       -decodeDeactivate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeInstruction))
    args))

(def StakeInstructionType
 "\"AuthorizeWithSeed\"|\"Authorize\"|\"Deactivate\"|\"Delegate\"|\"Initialize\"|\"Split\"|\"Withdraw\"|\"Merge\"" )

(defn StakeAuthorizationType_-index "*
     * The Stake Authorization index (from solana-stake-program)
     "  [this] (cljs.core/aget this "index" ))

(def StakeAuthorizationType {"index"  "*
     * The Stake Authorization index (from solana-stake-program)
      `number`" })

(def StakeProgram {"space"  "*
     * Max space of a Stake account
     *
     * This is generated from the solana-stake-program StakeState struct as
     * `std::mem::size_of::<StakeState>()`:
     * https://docs.rs/solana-stake-program/1.4.4/solana_stake_program/stake_state/enum.StakeState.html
      `number`" ,
                   "authorize"  "method - `StakeProgram_authorize`" ,
                   "withdraw"  "method - `StakeProgram_withdraw`" ,
                   "deactivate"  "method - `StakeProgram_deactivate`" ,
                   "split"  "method - `StakeProgram_split`" ,
                   "createAccountWithSeed" 
                   "method - `StakeProgram_createAccountWithSeed`" ,
                   "initialize"  "method - `StakeProgram_initialize`" ,
                   "delegate"  "method - `StakeProgram_delegate`" ,
                   "programId"  "*
     * Public key that identifies the Stake program
      `PublicKey`<>" ,
                   "authorizeWithSeed" 
                   "method - `StakeProgram_authorizeWithSeed`" ,
                   "merge"  "method - `StakeProgram_merge`" ,
                   "createAccount" 
                   "method - `StakeProgram_createAccount`" })

(cljs.core/comment "can only make function currently!!" )

(cljs.core/comment "can only make function currently!!" )

(defn StakeProgram_initialize "*
     * Generate an Initialize instruction to add to a Stake Create transaction
     
params - `InitializeStakeParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -initialize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_createAccountWithSeed "*
     * Generate a Transaction that creates a new Stake account at
     *   an address generated with `from`, a seed, and the Stake programId
     
params - `CreateStakeAccountWithSeedParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -createAccountWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_createAccount "*
     * Generate a Transaction that creates a new Stake account
     
params - `CreateStakeAccountParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -createAccount)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_delegate "*
     * Generate a Transaction that delegates Stake tokens to a validator
     * Vote PublicKey. This transaction can also be used to redelegate Stake
     * to a new validator Vote PublicKey.
     
params - `DelegateStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -delegate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_authorize "*
     * Generate a Transaction that authorizes a new PublicKey as Staker
     * or Withdrawer on the Stake account.
     
params - `AuthorizeStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -authorize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_authorizeWithSeed "*
     * Generate a Transaction that authorizes a new PublicKey as Staker
     * or Withdrawer on the Stake account.
     
params - `AuthorizeWithSeedStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -authorizeWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_split "*
     * Generate a Transaction that splits Stake tokens into another stake account
     
params - `SplitStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -split)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_merge "*
     * Generate a Transaction that merges Stake accounts.
     
params - `MergeStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -merge)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_withdraw "*
     * Generate a Transaction that withdraws deactivated Stake tokens.
     
params - `WithdrawStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -withdraw)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn StakeProgram_deactivate "*
     * Generate a Transaction that deactivates Stake tokens.
     
params - `DeactivateStakeParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram
       -deactivate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -StakeProgram))
    args))

(defn CreateAccountParams_-fromPubkey "*
     * The account that will transfer lamports to the created account
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn CreateAccountParams_-newAccountPubkey "*
     * Public key of the created account
     "  [this] (cljs.core/aget this "newAccountPubkey" ))

(defn CreateAccountParams_-lamports "*
     * Amount of lamports to transfer to the created account
     "  [this] (cljs.core/aget this "lamports" ))

(defn CreateAccountParams_-space "*
     * Amount of space in bytes to allocate to the created account
     "  [this] (cljs.core/aget this "space" ))

(defn CreateAccountParams_-programId "*
     * Public key of the program to assign as the owner of the created account
     "  [this] (cljs.core/aget this "programId" ))

(def CreateAccountParams {"fromPubkey"  "*
     * The account that will transfer lamports to the created account
      `PublicKey`<>" , "newAccountPubkey"  "*
     * Public key of the created account
      `PublicKey`<>" , "lamports"  "*
     * Amount of lamports to transfer to the created account
      `number`" , "space"  "*
     * Amount of space in bytes to allocate to the created account
      `number`" , "programId"  "*
     * Public key of the program to assign as the owner of the created account
      `PublicKey`<>" })

(defn TransferParams_-fromPubkey "*
     * Account that will transfer lamports
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn TransferParams_-toPubkey "*
     * Account that will receive transferred lamports
     "  [this] (cljs.core/aget this "toPubkey" ))

(defn TransferParams_-lamports "*
     * Amount of lamports to transfer
     "  [this] (cljs.core/aget this "lamports" ))

(def TransferParams {"fromPubkey"  "*
     * Account that will transfer lamports
      `PublicKey`<>" , "toPubkey"  "*
     * Account that will receive transferred lamports
      `PublicKey`<>" , "lamports"  "*
     * Amount of lamports to transfer
      `number`" })

(defn AssignParams_-accountPubkey "*
     * Public key of the account which will be assigned a new owner
     "  [this] (cljs.core/aget this "accountPubkey" ))

(defn AssignParams_-programId "*
     * Public key of the program to assign as the owner
     "  [this] (cljs.core/aget this "programId" ))

(def AssignParams {"accountPubkey"  "*
     * Public key of the account which will be assigned a new owner
      `PublicKey`<>" , "programId"  "*
     * Public key of the program to assign as the owner
      `PublicKey`<>" })

(defn CreateAccountWithSeedParams_-fromPubkey "*
     * The account that will transfer lamports to the created account
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn CreateAccountWithSeedParams_-newAccountPubkey "*
     * Public key of the created account. Must be pre-calculated with PublicKey.createWithSeed()
     "  [this] (cljs.core/aget this "newAccountPubkey" ))

(defn CreateAccountWithSeedParams_-basePubkey "*
     * Base public key to use to derive the address of the created account. Must be the same as the base key used to create `newAccountPubkey`
     "  [this] (cljs.core/aget this "basePubkey" ))

(defn CreateAccountWithSeedParams_-seed "*
     * Seed to use to derive the address of the created account. Must be the same as the seed used to create `newAccountPubkey`
     "  [this] (cljs.core/aget this "seed" ))

(defn CreateAccountWithSeedParams_-lamports "*
     * Amount of lamports to transfer to the created account
     "  [this] (cljs.core/aget this "lamports" ))

(defn CreateAccountWithSeedParams_-space "*
     * Amount of space in bytes to allocate to the created account
     "  [this] (cljs.core/aget this "space" ))

(defn CreateAccountWithSeedParams_-programId "*
     * Public key of the program to assign as the owner of the created account
     "  [this] (cljs.core/aget this "programId" ))

(def CreateAccountWithSeedParams {"fromPubkey"  "*
     * The account that will transfer lamports to the created account
      `PublicKey`<>" , "newAccountPubkey"  "*
     * Public key of the created account. Must be pre-calculated with PublicKey.createWithSeed()
      `PublicKey`<>" , "basePubkey"  "*
     * Base public key to use to derive the address of the created account. Must be the same as the base key used to create `newAccountPubkey`
      `PublicKey`<>" , "seed"  "*
     * Seed to use to derive the address of the created account. Must be the same as the seed used to create `newAccountPubkey`
      `string`" , "lamports"  "*
     * Amount of lamports to transfer to the created account
      `number`" , "space"  "*
     * Amount of space in bytes to allocate to the created account
      `number`" , "programId"  "*
     * Public key of the program to assign as the owner of the created account
      `PublicKey`<>" })

(defn CreateNonceAccountParams_-fromPubkey "*
     * The account that will transfer lamports to the created nonce account
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn CreateNonceAccountParams_-noncePubkey "*
     * Public key of the created nonce account
     "  [this] (cljs.core/aget this "noncePubkey" ))

(defn CreateNonceAccountParams_-authorizedPubkey "*
     * Public key to set as authority of the created nonce account
     "  [this] (cljs.core/aget this "authorizedPubkey" ))

(defn CreateNonceAccountParams_-lamports "*
     * Amount of lamports to transfer to the created nonce account
     "  [this] (cljs.core/aget this "lamports" ))

(def CreateNonceAccountParams {"fromPubkey"  "*
     * The account that will transfer lamports to the created nonce account
      `PublicKey`<>" , "noncePubkey"  "*
     * Public key of the created nonce account
      `PublicKey`<>" , "authorizedPubkey"  "*
     * Public key to set as authority of the created nonce account
      `PublicKey`<>" , "lamports"  "*
     * Amount of lamports to transfer to the created nonce account
      `number`" })

(defn CreateNonceAccountWithSeedParams_-fromPubkey "*
     * The account that will transfer lamports to the created nonce account
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn CreateNonceAccountWithSeedParams_-noncePubkey "*
     * Public key of the created nonce account
     "  [this] (cljs.core/aget this "noncePubkey" ))

(defn CreateNonceAccountWithSeedParams_-authorizedPubkey "*
     * Public key to set as authority of the created nonce account
     "  [this] (cljs.core/aget this "authorizedPubkey" ))

(defn CreateNonceAccountWithSeedParams_-lamports "*
     * Amount of lamports to transfer to the created nonce account
     "  [this] (cljs.core/aget this "lamports" ))

(defn CreateNonceAccountWithSeedParams_-basePubkey "*
     * Base public key to use to derive the address of the nonce account
     "  [this] (cljs.core/aget this "basePubkey" ))

(defn CreateNonceAccountWithSeedParams_-seed "*
     * Seed to use to derive the address of the nonce account
     "  [this] (cljs.core/aget this "seed" ))

(def CreateNonceAccountWithSeedParams {"fromPubkey"  "*
     * The account that will transfer lamports to the created nonce account
      `PublicKey`<>" , "noncePubkey"  "*
     * Public key of the created nonce account
      `PublicKey`<>" , "authorizedPubkey"  "*
     * Public key to set as authority of the created nonce account
      `PublicKey`<>" , "lamports"  "*
     * Amount of lamports to transfer to the created nonce account
      `number`" , "basePubkey"  "*
     * Base public key to use to derive the address of the nonce account
      `PublicKey`<>" , "seed"  "*
     * Seed to use to derive the address of the nonce account
      `string`" })

(defn InitializeNonceParams_-noncePubkey "*
     * Nonce account which will be initialized
     "  [this] (cljs.core/aget this "noncePubkey" ))

(defn InitializeNonceParams_-authorizedPubkey "*
     * Public key to set as authority of the initialized nonce account
     "  [this] (cljs.core/aget this "authorizedPubkey" ))

(def InitializeNonceParams {"noncePubkey"  "*
     * Nonce account which will be initialized
      `PublicKey`<>" , "authorizedPubkey"  "*
     * Public key to set as authority of the initialized nonce account
      `PublicKey`<>" })

(defn AdvanceNonceParams_-noncePubkey "*
     * Nonce account
     "  [this] (cljs.core/aget this "noncePubkey" ))

(defn AdvanceNonceParams_-authorizedPubkey "*
     * Public key of the nonce authority
     "  [this] (cljs.core/aget this "authorizedPubkey" ))

(def AdvanceNonceParams {"noncePubkey"  "*
     * Nonce account
      `PublicKey`<>" , "authorizedPubkey"  "*
     * Public key of the nonce authority
      `PublicKey`<>" })

(defn WithdrawNonceParams_-noncePubkey "*
     * Nonce account
     "  [this] (cljs.core/aget this "noncePubkey" ))

(defn WithdrawNonceParams_-authorizedPubkey "*
     * Public key of the nonce authority
     "  [this] (cljs.core/aget this "authorizedPubkey" ))

(defn WithdrawNonceParams_-toPubkey "*
     * Public key of the account which will receive the withdrawn nonce account balance
     "  [this] (cljs.core/aget this "toPubkey" ))

(defn WithdrawNonceParams_-lamports "*
     * Amount of lamports to withdraw from the nonce account
     "  [this] (cljs.core/aget this "lamports" ))

(def WithdrawNonceParams {"noncePubkey"  "*
     * Nonce account
      `PublicKey`<>" , "authorizedPubkey"  "*
     * Public key of the nonce authority
      `PublicKey`<>" , "toPubkey"  "*
     * Public key of the account which will receive the withdrawn nonce account balance
      `PublicKey`<>" , "lamports"  "*
     * Amount of lamports to withdraw from the nonce account
      `number`" })

(defn AuthorizeNonceParams_-noncePubkey "*
     * Nonce account
     "  [this] (cljs.core/aget this "noncePubkey" ))

(defn AuthorizeNonceParams_-authorizedPubkey "*
     * Public key of the current nonce authority
     "  [this] (cljs.core/aget this "authorizedPubkey" ))

(defn AuthorizeNonceParams_-newAuthorizedPubkey "*
     * Public key to set as the new nonce authority
     "  [this] (cljs.core/aget this "newAuthorizedPubkey" ))

(def AuthorizeNonceParams {"noncePubkey"  "*
     * Nonce account
      `PublicKey`<>" , "authorizedPubkey"  "*
     * Public key of the current nonce authority
      `PublicKey`<>" , "newAuthorizedPubkey"  "*
     * Public key to set as the new nonce authority
      `PublicKey`<>" })

(defn AllocateParams_-accountPubkey "*
     * Account to allocate
     "  [this] (cljs.core/aget this "accountPubkey" ))

(defn AllocateParams_-space "*
     * Amount of space in bytes to allocate
     "  [this] (cljs.core/aget this "space" ))

(def AllocateParams {"accountPubkey"  "*
     * Account to allocate
      `PublicKey`<>" , "space"  "*
     * Amount of space in bytes to allocate
      `number`" })

(defn AllocateWithSeedParams_-accountPubkey "*
     * Account to allocate
     "  [this] (cljs.core/aget this "accountPubkey" ))

(defn AllocateWithSeedParams_-basePubkey "*
     * Base public key to use to derive the address of the allocated account
     "  [this] (cljs.core/aget this "basePubkey" ))

(defn AllocateWithSeedParams_-seed "*
     * Seed to use to derive the address of the allocated account
     "  [this] (cljs.core/aget this "seed" ))

(defn AllocateWithSeedParams_-space "*
     * Amount of space in bytes to allocate
     "  [this] (cljs.core/aget this "space" ))

(defn AllocateWithSeedParams_-programId "*
     * Public key of the program to assign as the owner of the allocated account
     "  [this] (cljs.core/aget this "programId" ))

(def AllocateWithSeedParams {"accountPubkey"  "*
     * Account to allocate
      `PublicKey`<>" , "basePubkey"  "*
     * Base public key to use to derive the address of the allocated account
      `PublicKey`<>" , "seed"  "*
     * Seed to use to derive the address of the allocated account
      `string`" , "space"  "*
     * Amount of space in bytes to allocate
      `number`" , "programId"  "*
     * Public key of the program to assign as the owner of the allocated account
      `PublicKey`<>" })

(defn AssignWithSeedParams_-accountPubkey "*
     * Public key of the account which will be assigned a new owner
     "  [this] (cljs.core/aget this "accountPubkey" ))

(defn AssignWithSeedParams_-basePubkey "*
     * Base public key to use to derive the address of the assigned account
     "  [this] (cljs.core/aget this "basePubkey" ))

(defn AssignWithSeedParams_-seed "*
     * Seed to use to derive the address of the assigned account
     "  [this] (cljs.core/aget this "seed" ))

(defn AssignWithSeedParams_-programId "*
     * Public key of the program to assign as the owner
     "  [this] (cljs.core/aget this "programId" ))

(def AssignWithSeedParams {"accountPubkey"  "*
     * Public key of the account which will be assigned a new owner
      `PublicKey`<>" , "basePubkey"  "*
     * Base public key to use to derive the address of the assigned account
      `PublicKey`<>" , "seed"  "*
     * Seed to use to derive the address of the assigned account
      `string`" , "programId"  "*
     * Public key of the program to assign as the owner
      `PublicKey`<>" })

(defn TransferWithSeedParams_-fromPubkey "*
     * Account that will transfer lamports
     "  [this] (cljs.core/aget this "fromPubkey" ))

(defn TransferWithSeedParams_-basePubkey "*
     * Base public key to use to derive the funding account address
     "  [this] (cljs.core/aget this "basePubkey" ))

(defn TransferWithSeedParams_-toPubkey "*
     * Account that will receive transferred lamports
     "  [this] (cljs.core/aget this "toPubkey" ))

(defn TransferWithSeedParams_-lamports "*
     * Amount of lamports to transfer
     "  [this] (cljs.core/aget this "lamports" ))

(defn TransferWithSeedParams_-seed "*
     * Seed to use to derive the funding account address
     "  [this] (cljs.core/aget this "seed" ))

(defn TransferWithSeedParams_-programId "*
     * Program id to use to derive the funding account address
     "  [this] (cljs.core/aget this "programId" ))

(def TransferWithSeedParams {"fromPubkey"  "*
     * Account that will transfer lamports
      `PublicKey`<>" , "basePubkey"  "*
     * Base public key to use to derive the funding account address
      `PublicKey`<>" , "toPubkey"  "*
     * Account that will receive transferred lamports
      `PublicKey`<>" , "lamports"  "*
     * Amount of lamports to transfer
      `number`" , "seed"  "*
     * Seed to use to derive the funding account address
      `string`" , "programId"  "*
     * Program id to use to derive the funding account address
      `PublicKey`<>" })

(def SystemInstruction
 {"decodeCreateAccount" 
  "method - `SystemInstruction_decodeCreateAccount`" ,
  "decodeAssign"  "method - `SystemInstruction_decodeAssign`" ,
  "decodeTransfer"  "method - `SystemInstruction_decodeTransfer`" ,
  "decodeAssignWithSeed" 
  "method - `SystemInstruction_decodeAssignWithSeed`" ,
  "decodeNonceWithdraw" 
  "method - `SystemInstruction_decodeNonceWithdraw`" ,
  "decodeInstructionType" 
  "method - `SystemInstruction_decodeInstructionType`" ,
  "decodeNonceAdvance" 
  "method - `SystemInstruction_decodeNonceAdvance`" ,
  "decodeTransferWithSeed" 
  "method - `SystemInstruction_decodeTransferWithSeed`" ,
  "decodeCreateWithSeed" 
  "method - `SystemInstruction_decodeCreateWithSeed`" ,
  "decodeNonceAuthorize" 
  "method - `SystemInstruction_decodeNonceAuthorize`" ,
  "decodeAllocate"  "method - `SystemInstruction_decodeAllocate`" ,
  "decodeNonceInitialize" 
  "method - `SystemInstruction_decodeNonceInitialize`" ,
  "decodeAllocateWithSeed" 
  "method - `SystemInstruction_decodeAllocateWithSeed`" })

(defn SystemInstruction_decodeInstructionType "*
     * Decode a system instruction and retrieve the instruction type.
     
instruction - `TransactionInstruction`<>


-@return -`SystemInstructionType`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeInstructionType)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeCreateAccount "*
     * Decode a create account system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`CreateAccountParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeCreateAccount)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeTransfer "*
     * Decode a transfer system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`TransferParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeTransfer)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeTransferWithSeed "*
     * Decode a transfer with seed system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`TransferWithSeedParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeTransferWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeAllocate "*
     * Decode an allocate system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AllocateParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeAllocate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeAllocateWithSeed "*
     * Decode an allocate with seed system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AllocateWithSeedParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeAllocateWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeAssign "*
     * Decode an assign system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AssignParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeAssign)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeAssignWithSeed "*
     * Decode an assign with seed system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AssignWithSeedParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeAssignWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeCreateWithSeed "*
     * Decode a create account with seed system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`CreateAccountWithSeedParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeCreateWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeNonceInitialize "*
     * Decode a nonce initialize system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`InitializeNonceParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeNonceInitialize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeNonceAdvance "*
     * Decode a nonce advance system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AdvanceNonceParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeNonceAdvance)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeNonceWithdraw "*
     * Decode a nonce withdraw system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`WithdrawNonceParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeNonceWithdraw)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(defn SystemInstruction_decodeNonceAuthorize "*
     * Decode a nonce authorize system instruction and retrieve the instruction params.
     
instruction - `TransactionInstruction`<>


-@return -`AuthorizeNonceParams`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction
       -decodeNonceAuthorize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemInstruction))
    args))

(def SystemInstructionType
 "\"AdvanceNonceAccount\"|\"Allocate\"|\"AllocateWithSeed\"|\"Assign\"|\"AssignWithSeed\"|\"AuthorizeNonceAccount\"|\"Create\"|\"CreateWithSeed\"|\"InitializeNonceAccount\"|\"Transfer\"|\"TransferWithSeed\"|\"WithdrawNonceAccount\"" )

(def SystemProgram
 {"nonceInitialize"  "method - `SystemProgram_nonceInitialize`" ,
  "assign"  "method - `SystemProgram_assign`" ,
  "nonceWithdraw"  "method - `SystemProgram_nonceWithdraw`" ,
  "nonceAuthorize"  "method - `SystemProgram_nonceAuthorize`" ,
  "allocate"  "method - `SystemProgram_allocate`" ,
  "createNonceAccount"  "method - `SystemProgram_createNonceAccount`" ,
  "createAccountWithSeed" 
  "method - `SystemProgram_createAccountWithSeed`" ,
  "transfer"  "method - `SystemProgram_transfer`" ,
  "nonceAdvance"  "method - `SystemProgram_nonceAdvance`" ,
  "programId"  "*
     * Public key that identifies the System program
      `PublicKey`<>" ,
  "createAccount"  "method - `SystemProgram_createAccount`" })

(cljs.core/comment "can only make function currently!!" )

(defn SystemProgram_createAccount "*
     * Generate a transaction instruction that creates a new account
     
params - `CreateAccountParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -createAccount)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_transfer "*
     * Generate a transaction instruction that transfers lamports from one account to another
     
params - `TransferParams`<>|`TransferWithSeedParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -transfer)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_assign "*
     * Generate a transaction instruction that assigns an account to a program
     
params - `AssignParams`<>|`AssignWithSeedParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -assign)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_createAccountWithSeed "*
     * Generate a transaction instruction that creates a new account at
     *   an address generated with `from`, a seed, and programId
     
params - `CreateAccountWithSeedParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -createAccountWithSeed)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_createNonceAccount "*
     * Generate a transaction that creates a new Nonce account
     
params - `CreateNonceAccountParams`<>|`CreateNonceAccountWithSeedParams`<>


-@return -`Transaction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -createNonceAccount)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_nonceInitialize "*
     * Generate an instruction to initialize a Nonce account
     
params - `InitializeNonceParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -nonceInitialize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_nonceAdvance "*
     * Generate an instruction to advance the nonce in a Nonce account
     
params - `AdvanceNonceParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -nonceAdvance)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_nonceWithdraw "*
     * Generate a transaction instruction that withdraws lamports from a Nonce account
     
params - `WithdrawNonceParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -nonceWithdraw)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_nonceAuthorize "*
     * Generate a transaction instruction that authorizes a new PublicKey as the authority
     * on a Nonce account.
     
params - `AuthorizeNonceParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -nonceAuthorize)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn SystemProgram_allocate "*
     * Generate a transaction instruction that allocates space in an account without funding
     
params - `AllocateParams`<>|`AllocateWithSeedParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram
       -allocate)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -SystemProgram))
    args))

(defn CreateSecp256k1InstructionWithPublicKeyParams_-publicKey
  "" 
  [this]
  (cljs.core/aget this "publicKey" ))

(defn CreateSecp256k1InstructionWithPublicKeyParams_-message
  "" 
  [this]
  (cljs.core/aget this "message" ))

(defn CreateSecp256k1InstructionWithPublicKeyParams_-signature
  "" 
  [this]
  (cljs.core/aget this "signature" ))

(defn CreateSecp256k1InstructionWithPublicKeyParams_-recoveryId
  "" 
  [this]
  (cljs.core/aget this "recoveryId" ))

(defn CreateSecp256k1InstructionWithPublicKeyParams_-instructionIndex
  "" 
  [this]
  (cljs.core/aget this "instructionIndex" ))

(def CreateSecp256k1InstructionWithPublicKeyParams
 {"publicKey"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "message"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "signature"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "recoveryId"  " `number`" ,
  "instructionIndex"  " `number`" })

(defn CreateSecp256k1InstructionWithEthAddressParams_-ethAddress
  "" 
  [this]
  (cljs.core/aget this "ethAddress" ))

(defn CreateSecp256k1InstructionWithEthAddressParams_-message
  "" 
  [this]
  (cljs.core/aget this "message" ))

(defn CreateSecp256k1InstructionWithEthAddressParams_-signature
  "" 
  [this]
  (cljs.core/aget this "signature" ))

(defn CreateSecp256k1InstructionWithEthAddressParams_-recoveryId
  "" 
  [this]
  (cljs.core/aget this "recoveryId" ))

(defn CreateSecp256k1InstructionWithEthAddressParams_-instructionIndex
  "" 
  [this]
  (cljs.core/aget this "instructionIndex" ))

(def CreateSecp256k1InstructionWithEthAddressParams
 {"ethAddress" 
  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>|`string`" ,
  "message"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "signature"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "recoveryId"  " `number`" ,
  "instructionIndex"  " `number`" })

(defn CreateSecp256k1InstructionWithPrivateKeyParams_-privateKey
  "" 
  [this]
  (cljs.core/aget this "privateKey" ))

(defn CreateSecp256k1InstructionWithPrivateKeyParams_-message
  "" 
  [this]
  (cljs.core/aget this "message" ))

(defn CreateSecp256k1InstructionWithPrivateKeyParams_-instructionIndex
  "" 
  [this]
  (cljs.core/aget this "instructionIndex" ))

(def CreateSecp256k1InstructionWithPrivateKeyParams
 {"privateKey"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "message"  " `Buffer`<>|`Uint8Array`<>|`Array`<`number`>" ,
  "instructionIndex"  " `number`" })

(def Secp256k1Program {"programId"  "*
     * Public key that identifies the secp256k1 program
      `PublicKey`<>" ,
                       "publicKeyToEthAddress" 
                       "method - `Secp256k1Program_publicKeyToEthAddress`" ,
                       "createInstructionWithPublicKey" 
                       "method - `Secp256k1Program_createInstructionWithPublicKey`" ,
                       "createInstructionWithEthAddress" 
                       "method - `Secp256k1Program_createInstructionWithEthAddress`" ,
                       "createInstructionWithPrivateKey" 
                       "method - `Secp256k1Program_createInstructionWithPrivateKey`" })

(cljs.core/comment "can only make function currently!!" )

(defn Secp256k1Program_publicKeyToEthAddress "*
     * Construct an Ethereum address from a secp256k1 public key buffer.
     * -@param {Buffer} publicKey a 64 byte secp256k1 public key buffer
     
publicKey - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`Buffer`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program
       -publicKeyToEthAddress)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program))
    args))

(defn Secp256k1Program_createInstructionWithPublicKey "*
     * Create an secp256k1 instruction with a public key. The public key
     * must be a buffer that is 64 bytes long.
     
params - `CreateSecp256k1InstructionWithPublicKeyParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program
       -createInstructionWithPublicKey)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program))
    args))

(defn Secp256k1Program_createInstructionWithEthAddress "*
     * Create an secp256k1 instruction with an Ethereum address. The address
     * must be a hex string or a buffer that is 20 bytes long.
     
params - `CreateSecp256k1InstructionWithEthAddressParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program
       -createInstructionWithEthAddress)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program))
    args))

(defn Secp256k1Program_createInstructionWithPrivateKey "*
     * Create an secp256k1 instruction with a private key. The private key
     * must be a buffer that is 32 bytes long.
     
params - `CreateSecp256k1InstructionWithPrivateKeyParams`<>


-@return -`TransactionInstruction`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program
       -createInstructionWithPrivateKey)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -Secp256k1Program))
    args))

(defn Info_-name "*
     * validator name
     "  [this] (cljs.core/aget this "name" ))

(defn Info_-website "*
     * optional, validator website
     "  [this] (cljs.core/aget this "website" ))

(defn Info_-details "*
     * optional, extra information the validator chose to share
     "  [this] (cljs.core/aget this "details" ))

(defn Info_-keybaseUsername "*
     * optional, used to identify validators on keybase.io
     "  [this] (cljs.core/aget this "keybaseUsername" ))

(def Info {"name"  "*
     * validator name
      `string`" , "website"  "*
     * optional, validator website
      `string`" , "details"  "*
     * optional, extra information the validator chose to share
      `string`" , "keybaseUsername"  "*
     * optional, used to identify validators on keybase.io
      `string`" })

(def ValidatorInfo {"key"  "*
     * validator public key
      `PublicKey`<>" , "info"  "*
     * validator information
      `Info`<>" ,
                    "constructor" 
                    "method - `ValidatorInfo_constructor`" ,
                    "fromConfigData" 
                    "method - `ValidatorInfo_fromConfigData`" })

(defn ValidatorInfo_-key "*
     * validator public key
     "  [this] (cljs.core/aget this "key" ))

(defn ValidatorInfo_-info "*
     * validator information
     "  [this] (cljs.core/aget this "info" ))

(defn ValidatorInfo_constructor "*
     * Construct a valid ValidatorInfo
     * -@param key validator public key
     * -@param info validator information
     
key - `PublicKey`<>
info - `Info`<>


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -ValidatorInfo)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn ValidatorInfo_fromConfigData "*
     * Deserialize ValidatorInfo from the config account data. Exactly two config
     * keys are required in the data.
     * -@param buffer config account data
     * -@return null if info was not found
     
buffer - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`ValidatorInfo`<>|`NullLiteralTypeAnnotation`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -ValidatorInfo
       -fromConfigData)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -ValidatorInfo))
    args))

(defn Lockout_-slot ""  [this] (cljs.core/aget this "slot" ))

(defn Lockout_-confirmationCount
  "" 
  [this]
  (cljs.core/aget this "confirmationCount" ))

(def Lockout {"slot"  " `number`" , "confirmationCount"  " `number`" })

(defn EpochCredits_-epoch ""  [this] (cljs.core/aget this "epoch" ))

(defn EpochCredits_-credits ""  [this] (cljs.core/aget this "credits" ))

(defn EpochCredits_-prevCredits
  "" 
  [this]
  (cljs.core/aget this "prevCredits" ))

(def EpochCredits
 {"epoch"  " `number`" ,
  "credits"  " `number`" ,
  "prevCredits"  " `number`" })

(defn AuthorizedVoter_-epoch ""  [this] (cljs.core/aget this "epoch" ))

(defn AuthorizedVoter_-authorizedVoter
  "" 
  [this]
  (cljs.core/aget this "authorizedVoter" ))

(def AuthorizedVoter
 {"epoch"  " `number`" , "authorizedVoter"  " `PublicKey`<>" })

(defn PriorVoter_-authorizedPubkey
  "" 
  [this]
  (cljs.core/aget this "authorizedPubkey" ))

(defn PriorVoter_-epochOfLastAuthorizedSwitch
  "" 
  [this]
  (cljs.core/aget this "epochOfLastAuthorizedSwitch" ))

(defn PriorVoter_-targetEpoch
  "" 
  [this]
  (cljs.core/aget this "targetEpoch" ))

(def PriorVoter
 {"authorizedPubkey"  " `PublicKey`<>" ,
  "epochOfLastAuthorizedSwitch"  " `number`" ,
  "targetEpoch"  " `number`" })

(defn BlockTimestamp_-slot ""  [this] (cljs.core/aget this "slot" ))

(defn BlockTimestamp_-timetamp
  "" 
  [this]
  (cljs.core/aget this "timetamp" ))

(def BlockTimestamp {"slot"  " `number`" , "timetamp"  " `number`" })

(def VoteAccount
 {"fromAccountData"  "method - `VoteAccount_fromAccountData`" ,
  "commission"  " `number`" ,
  "authorizedVoters"  " `ArrayTypeAnnotation`" ,
  "priorVoters"  " `ArrayTypeAnnotation`" ,
  "lastTimestamp"  " `BlockTimestamp`<>" ,
  "epochCredits"  " `ArrayTypeAnnotation`" ,
  "rootSlot"  " `number`|`NullLiteralTypeAnnotation`" ,
  "nodePubkey"  " `PublicKey`<>" ,
  "votes"  " `ArrayTypeAnnotation`" ,
  "authorizedWithdrawer"  " `PublicKey`<>" })

(defn VoteAccount_-nodePubkey
  "" 
  [this]
  (cljs.core/aget this "nodePubkey" ))

(defn VoteAccount_-authorizedWithdrawer
  "" 
  [this]
  (cljs.core/aget this "authorizedWithdrawer" ))

(defn VoteAccount_-commission
  "" 
  [this]
  (cljs.core/aget this "commission" ))

(defn VoteAccount_-rootSlot
  "" 
  [this]
  (cljs.core/aget this "rootSlot" ))

(defn VoteAccount_-votes ""  [this] (cljs.core/aget this "votes" ))

(defn VoteAccount_-authorizedVoters
  "" 
  [this]
  (cljs.core/aget this "authorizedVoters" ))

(defn VoteAccount_-priorVoters
  "" 
  [this]
  (cljs.core/aget this "priorVoters" ))

(defn VoteAccount_-epochCredits
  "" 
  [this]
  (cljs.core/aget this "epochCredits" ))

(defn VoteAccount_-lastTimestamp
  "" 
  [this]
  (cljs.core/aget this "lastTimestamp" ))

(defn VoteAccount_fromAccountData "*
     * Deserialize VoteAccount from the account data.
     * -@param buffer account data
     * -@return VoteAccount
     
buffer - `Buffer`<>|`Uint8Array`<>|`Array`<`number`>


-@return -`VoteAccount`<>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -VoteAccount
       -fromAccountData)
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -VoteAccount))
    args))

(def SendTransactionError
 {"logs"  " `ArrayTypeAnnotation`|`VoidTypeAnnotation`" ,
  "constructor"  "method - `SendTransactionError_constructor`" })

(defn SendTransactionError_-logs
  "" 
  [this]
  (cljs.core/aget this "logs" ))

(defn SendTransactionError_constructor "
message - `string`
logs - `ArrayTypeAnnotation`


-@return -`this`<>"
  [& args]
  (cljs.core/let
    [f
     (js/Function.prototype.bind.apply
       (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
        -SendTransactionError)
       (cljs.core/clj->js (cljs.core/cons nil args)))]
    (new f)))

(defn sendAndConfirmTransaction "
connection - `Connection`<>
transaction - `Transaction`<>
signers - `Array`<`Signer`<>>
options - `ConfirmOptions`<>


-@return -`Promise`<`TransactionSignature`<>>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -sendAndConfirmTransaction)
      js/module$node_modules$$solana$web3_js$lib$index_browser_esm)
    args))

(defn sendAndConfirmRawTransaction "
connection - `Connection`<>
rawTransaction - `Buffer`<>
options - `ConfirmOptions`<>


-@return -`Promise`<`TransactionSignature`<>>"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -sendAndConfirmRawTransaction)
      js/module$node_modules$$solana$web3_js$lib$index_browser_esm)
    args))

(def Cluster "\"devnet\"|\"testnet\"|\"mainnet-beta\"" )

(defn clusterApiUrl "
cluster - `Cluster`<>
tls - `bool`


-@return -`string`"
  [& args]
  (apply
    (.bind
      (.. js/module$node_modules$$solana$web3_js$lib$index_browser_esm
       -clusterApiUrl)
      js/module$node_modules$$solana$web3_js$lib$index_browser_esm)
    args))

