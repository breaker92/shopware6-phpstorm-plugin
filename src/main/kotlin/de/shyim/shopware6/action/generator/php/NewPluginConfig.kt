package de.shyim.shopware6.action.generator.php

class NewPluginConfig(
    val name: String,
    val namespace: String,
    val composerName: String,
    val license: String,
    val author: String,
    val description: String
) {
    fun toMap(): Map<String, String> {
        return mapOf(
            "NAME" to this.name,
            "NAMESPACE" to this.namespace.replace("\\", "\\\\"),
            "COMPOSER_NAME" to this.composerName,
            "DESCRIPTION" to this.description,
            "AUTHOR" to this.author,
            "LICENSE" to this.license,
        )
    }
}