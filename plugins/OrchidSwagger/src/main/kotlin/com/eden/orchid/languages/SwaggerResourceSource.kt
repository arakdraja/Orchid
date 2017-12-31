package com.eden.orchid.languages

import com.eden.orchid.api.OrchidContext
import com.eden.orchid.api.resources.resourceSource.PluginResourceSource

import javax.inject.Inject

class SwaggerResourceSource @Inject
constructor(context: OrchidContext) : PluginResourceSource(context, 100)
