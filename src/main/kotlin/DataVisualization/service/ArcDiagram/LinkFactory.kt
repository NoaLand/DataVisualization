package DataVisualization.service.ArcDiagram

import DataVisualization.domain.ArcDiagram.DEFAULT_VALUE_NUMBER
import DataVisualization.domain.ArcDiagram.Link

class LinkFactory {
    fun createLinkFrom(content: List<String>): List<Link> {
        val linkList = ArrayList<Link>()

        content.map {
            it.split(",").sizeShouldBe(8)
        }.forEach {
            linkList.add(Link(source = "${it[1]}, ${it[2]}", target = "${it[4]}, ${it[5]}", value = DEFAULT_VALUE_NUMBER))
        }

        return linkList
    }
}