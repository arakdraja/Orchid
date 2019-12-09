package com.eden.orchid.api.tasks

import com.eden.orchid.api.OrchidContext
import com.eden.orchid.api.options.Descriptive
import com.eden.orchid.api.registration.Prioritized
import com.eden.orchid.utilities.OrchidUtils.DEFAULT_PRIORITY

/**
 * A Runnable tailored for executing some task in Orchid. The 'name' of this OrchidTask is used on the command-line for
 * non-Javadoc builds to execute an alternative OrchidTask. The default OrchidTask builds the site once.
 *
 * @since v1.0.0
 * @orchidApi extensible
 */
abstract class OrchidTask
@JvmOverloads
constructor(
    open val name: String,
    open val taskType: TaskService.TaskType,
    priority: Int = DEFAULT_PRIORITY
) : Prioritized(priority), Descriptive {

    abstract fun run(context: OrchidContext)
}
