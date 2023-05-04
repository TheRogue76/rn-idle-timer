
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNRnIdleTimerSpec.h"

@interface RnIdleTimer : NSObject <NativeRnIdleTimerSpec>
#else
#import <React/RCTBridgeModule.h>

@interface RnIdleTimer : NSObject <RCTBridgeModule>
#endif

@end
