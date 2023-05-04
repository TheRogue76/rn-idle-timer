#import "RnIdleTimer.h"

@implementation RnIdleTimer
RCT_EXPORT_MODULE()

- (void)setIdleTimerDisabled:(BOOL)status {
    dispatch_async(dispatch_get_main_queue(), ^{
        [[UIApplication sharedApplication] setIdleTimerDisabled:status];
    });
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeRnIdleTimerSpecJSI>(params);
}
#endif

@end
