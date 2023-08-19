package dev.siro256.kotatsumodelformat

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ModelObject(
    @ProtoNumber(1) val name: String,
    @ProtoNumber(2) val faces: List<Face>,
)
