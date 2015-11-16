// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import dnu;
import eev;
import gdv;
import java.io.IOException;

public class AudioPlayerService extends Service
{

    private static final boolean a = false;
    private dnu b;

    public AudioPlayerService()
    {
        b = null;
    }

    public static Intent a(String s, String s1)
    {
        s = new Intent(s);
        s.putExtra("play_id", s1);
        return s;
    }

    public static dnu a(AudioPlayerService audioplayerservice)
    {
        return audioplayerservice.b;
    }

    private static String a(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder(19)).append("UNKNOWN:").append(i).toString();

        case 1: // '\001'
            return "PREPARE";

        case 2: // '\002'
            return "PLAY";

        case 3: // '\003'
            return "PAUSE";

        case 4: // '\004'
            return "SEEK";

        case 5: // '\005'
            return "STOP";

        case 6: // '\006'
            return "REGISTER";

        case 7: // '\007'
            return "UNREGISTER";
        }
    }

    public static boolean a()
    {
        return a;
    }

    public static dnu b(AudioPlayerService audioplayerservice)
    {
        audioplayerservice.b = null;
        return null;
    }

    private void b()
    {
        b.g();
        b = null;
    }

    protected void a(Intent intent)
    {
        int i = intent.getIntExtra("op", 0);
        String s1 = intent.getStringExtra("play_id");
        if (TextUtils.isEmpty(s1))
        {
            eev.f("Babel", "No EXTRA_PLAY_ID in intent sent to AudioPlayerService.");
            return;
        }
        if (i != 1 && (b == null || !s1.equals(b.a())))
        {
            intent = String.valueOf(a(i));
            eev.f("Babel", (new StringBuilder(String.valueOf(intent).length() + 51 + String.valueOf(s1).length())).append("Ignoring ").append(intent).append(" message because playId \"").append(s1).append("\" is not current.").toString());
            sendBroadcast(a("play_stopped", s1));
            return;
        }
        if (a)
        {
            String s = String.valueOf(a(i));
            if (s.length() != 0)
            {
                s = "AudioPlayerService received op: ".concat(s);
            } else
            {
                s = new String("AudioPlayerService received op: ");
            }
            eev.b("Babel", s);
        }
        switch (i)
        {
        default:
            eev.f("Babel", (new StringBuilder(40)).append("Unrecognized EXTRA_OP value: ").append(i).toString());
            return;

        case 1: // '\001'
            if (b != null)
            {
                b();
            }
            intent = intent.getStringExtra("audio_stream_url");
            gdv.b("Expected condition to be false", TextUtils.isEmpty(intent));
            try
            {
                b = new dnu(this, this, intent, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                sendBroadcast(a("play_stopped", s1));
            }
            b = null;
            return;

        case 2: // '\002'
            b.b();
            return;

        case 3: // '\003'
            b.c();
            return;

        case 4: // '\004'
            b.a(intent.getIntExtra("position_in_milliseconds", 0));
            return;

        case 5: // '\005'
            b();
            return;

        case 6: // '\006'
            b.d();
            return;

        case 7: // '\007'
            b.e();
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        if (b != null)
        {
            b();
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null)
        {
            a(intent);
            if (b == null)
            {
                stopSelf();
                return 2;
            }
        }
        return 2;
    }

    static 
    {
        hnc hnc = eev.a;
    }
}
