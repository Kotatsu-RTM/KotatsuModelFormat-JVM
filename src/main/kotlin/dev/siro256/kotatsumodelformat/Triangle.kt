package dev.siro256.kotatsumodelformat

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Triangle(
    @ProtoNumber(1) val firstVertex: Int,
    @ProtoNumber(2) val secondVertex: Int,
    @ProtoNumber(3) val thirdVertex: Int,
)
