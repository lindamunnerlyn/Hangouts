// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ghs
{

    private static final String a[][];
    private static ght b;

    static ght a()
    {
        return b;
    }

    public static void a(ght ght)
    {
        b = ght;
    }

    static String[][] b()
    {
        return a;
    }

    static 
    {
        String as[] = {
            "babel_hangout_blocked_interface_names", "USE_DEFAULT_NETWORKS_ONLY"
        };
        String as1[] = {
            "babel_hangout_ec_comfort_noise_generation", "EC_COMFORT_NOISE_GENERATION"
        };
        String as2[] = {
            "babel_hangout_agc_mode", "AGC_MODE"
        };
        String as3[] = {
            "babel_hangout_agc_config_target_level", "AGC_CONFIG_TARGET_LEVEL"
        };
        String as4[] = {
            "babel_hangout_agc_config_comp_gain", "AGC_CONFIG_COMP_GAIN"
        };
        String as5[] = {
            "babel_hangout_agc_config_limiter_enable", "AGC_CONFIG_LIMITER_ENABLE"
        };
        String as6[] = {
            "babel_hangout_enable_rx_auto_gain_control", "ENABLE_RX_AUTO_GAIN_CONTROL"
        };
        String as7[] = {
            "babel_hangout_rx_agc_config_comp_gain", "RX_AGC_CONFIG_COMP_GAIN"
        };
        String as8[] = {
            "babel_hangout_rx_agc_config_limiter_enable", "RX_AGC_CONFIG_LIMITER_ENABLE"
        };
        String as9[] = {
            "babel_hangout_audio_record_sampling_rate", "AUDIO_RECORDING_SAMPLING_RATE"
        };
        String as10[] = {
            "babel_hangout_audio_playback_sampling_rate", "AUDIO_PLAYBACK_SAMPLING_RATE"
        };
        String as11[] = {
            "babel_hangout_audio_recording_device", "AUDIO_RECORDING_DEVICE"
        };
        String as12[] = {
            "babel_hangout_enter_step_timeout", "CALL_ENTER_STEP_TIMEOUT_MILLIS"
        };
        String as13[] = {
            "babel_hangout_log_file_size", "DIAGNOSTIC_RAW_LOG_FILE_SIZE_BYTES"
        };
        String as14[] = {
            "babel_hangout_h264_bitstream_rewrite_type", "H264_BITSTREAM_REWRITE_TYPE"
        };
        a = (new String[][] {
            as, as1, as2, as3, as4, as5, as6, new String[] {
                "babel_hangout_rx_agc_config_target_level", "RX_AGC_CONFIG_TARGET_LEVEL"
            }, as7, as8, 
            as9, as10, as11, as12, as13, as14
        });
    }
}
