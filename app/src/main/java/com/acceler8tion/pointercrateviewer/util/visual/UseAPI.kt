package com.acceler8tion.pointercrateviewer.util.visual

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class UseAPI(val type: APIType) {

    enum class APIType() {
        DEMON,
        PLAYER,
        METADATA
    }
}