package dev.siro256.kotatsumodelformat

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ModelFile(
    @ProtoNumber(1) val vertices: List<Vector3f>,
    @ProtoNumber(2) val normals: List<Vector3f>,
    @ProtoNumber(3) val uvs: List<Vector2f>,
    @ProtoNumber(4) val materials: List<String>,
    @ProtoNumber(5) val objects: List<ModelObject>,
)
