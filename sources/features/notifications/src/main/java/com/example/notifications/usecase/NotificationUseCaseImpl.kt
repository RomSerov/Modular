package com.example.notifications.usecase

import com.example.core.notification.NotificationUseCase
import com.example.core.tools.Toaster
import javax.inject.Inject

class NotificationUseCaseImpl @Inject constructor(
    private val toaster: Toaster
): NotificationUseCase {

    override fun showMessage() {
        toaster.show(msg = "notifications are not implemented")
    }
}