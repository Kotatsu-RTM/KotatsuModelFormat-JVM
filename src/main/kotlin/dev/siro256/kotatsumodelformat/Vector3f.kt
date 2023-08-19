package dev.siro256.kotatsumodelformat

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Vector3f(
    @ProtoNumber(1) val x: Int,
    @ProtoNumber(2) val y: Int,
    @ProtoNumber(3) val z: Int,
)
