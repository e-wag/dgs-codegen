package com.netflix.graphql.dgs.codegen.cases.projectionWithEnum.expected

import com.netflix.graphql.dgs.codegen.cases.projectionWithEnum.expected.client.QueryProjection
import kotlin.String

public object DgsClient {
  public fun buildQuery(_projection: QueryProjection.() -> QueryProjection): String {
    val projection = QueryProjection()
    _projection.invoke(projection)
    return "query ${projection.asQuery()}"
  }
}