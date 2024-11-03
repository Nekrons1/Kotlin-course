package org.belafu.kotlincourse.lesson16

import javax.print.attribute.standard.Sides

open class  Figure (
    val side: Int
)

open class Polygon (
    side: Int,
    val vertices: Int
) : Figure(side)

class Circle (
    side: Int,
    val space: Int
) : Figure(side)

class Triangle (
    side: Int,
    vertices: Int,
    val angle: Int
) : Polygon(side, vertices)

class Tetragon (
    side: Int,
    vertices: Int,
    val corner: Int
) : Polygon(side, vertices)


open class  educationalInstitution (
    val lesson: String
)

class School (
    lesson: String,
    val timeBreak: Int
) : educationalInstitution(lesson)

open class Institute (
    lesson: String,
    val credits: Int
) : educationalInstitution(lesson)

class Magistracy (
    lesson: String,
    credits: Int,
    val diplomaTopic: String
) : Institute(lesson, credits)



open class Furniture(
    val material: String
)

class Table(
    material: String,
    val shape: String
) : Furniture(material)


open class Seating(
    material: String,
    val capacity: Int
) : Furniture(material)

class Chair(
    material: String,
    capacity: Int,
    val hasArmrests: Boolean
) : Seating(material, capacity)


open class Bed(
    material: String,
    val bedSize: Int
) : Furniture(material)

class DoubleBed(
    material: String,
    bedSize: Int,
    val hasStorage: Boolean
) : Bed(material, bedSize)