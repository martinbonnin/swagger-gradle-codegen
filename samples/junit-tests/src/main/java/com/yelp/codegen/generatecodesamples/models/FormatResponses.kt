/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.models

import com.squareup.moshi.Json
import org.threeten.bp.LocalDate
import org.threeten.bp.ZonedDateTime

/**
 *
 * @property dateProperty
 * @property datetimeProperty
 * @property enumProperty
 */
data class FormatResponses(
    @Json(name = "date_property") @field:Json(name = "date_property") var dateProperty: LocalDate? = null,
    @Json(name = "datetime_property") @field:Json(name = "datetime_property") var datetimeProperty: ZonedDateTime? = null,
    @Json(name = "enum_property") @field:Json(name = "enum_property") var enumProperty: FormatResponses.EnumPropertyEnum? = null
) {
    /**
     *
     * Values: VALUE1, VALUE2
     */
    enum class EnumPropertyEnum(val value: String) {
        @Json(name = "VALUE1") VALUE1("VALUE1"),
        @Json(name = "VALUE2") VALUE2("VALUE2")
    }
}
