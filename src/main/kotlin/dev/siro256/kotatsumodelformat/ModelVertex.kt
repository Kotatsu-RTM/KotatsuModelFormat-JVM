package dev.siro256.kotatsumodelformat

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ModelVertex(
    @ProtoNumber(1) val vertex: Int,
    @ProtoNumber(2) val normal: Int,
    @ProtoNumber(3) val uv: Int?,
)
