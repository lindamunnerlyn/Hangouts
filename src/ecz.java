// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.service.AudioPlayerService;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class ecz
{

    public static ecz a;
    public static edc b;
    public final Context c;
    String d;
    int e;
    private final String f;
    private String g;
    private int h;
    private long i;
    private AudioManager j;
    private AudioAttachmentView k;
    private int l;
    private int m;
    private BroadcastReceiver n;
    private final Runnable o = new eda(this);

    public ecz(AudioAttachmentView audioattachmentview, String s, String s1, long l1)
    {
        c = audioattachmentview.getContext().getApplicationContext();
        f = s;
        if (b(s1, l1))
        {
            d = s1;
            i = l1;
        }
        j = (AudioManager)c.getSystemService("audio");
        e = 0;
    }

    private static void a(ecz ecz1)
    {
        if (a != ecz1)
        {
            a = ecz1;
            if (b != null)
            {
                b.a(1);
                return;
            }
        }
    }

    private void a(String s)
    {
        c.getSharedPreferences("AudioAttachment", 0).edit().putString("output", s).apply();
    }

    private void b(int i1)
    {
        if (e != i1)
        {
            if (AudioAttachmentView.g())
            {
                String s = String.valueOf(c(i1));
                if (s.length() != 0)
                {
                    s = "new state:".concat(s);
                } else
                {
                    s = new String("new state:");
                }
                a("setState", s);
            }
            e = i1;
            if (k != null)
            {
                AudioAttachmentView.a(k);
            }
        }
    }

    private static boolean b(String s, long l1)
    {
        return !TextUtils.isEmpty(s) && (l1 == 0L || System.currentTimeMillis() < l1);
    }

    private static String c(int i1)
    {
        switch (i1)
        {
        default:
            return (new StringBuilder(19)).append("UNKNOWN:").append(i1).toString();

        case 0: // '\0'
            return "IDLE";

        case 1: // '\001'
            return "PREFETCH";

        case 2: // '\002'
            return "FETCH_FOR_PLAY";

        case 3: // '\003'
            return "PREPARING";

        case 4: // '\004'
            return "PLAYING";

        case 5: // '\005'
            return "PAUSED";
        }
    }

    private void m()
    {
        j.setSpeakerphoneOn("speaker".equals(c()));
    }

    private void n()
    {
        a("sendPrepare", "");
        Intent intent = a(1);
        intent.putExtra("audio_stream_url", d);
        c.startService(intent);
    }

    private void o()
    {
        a("sendPlay", "");
        c.startService(a(2));
    }

    private void p()
    {
        a("sendPause", "");
        c.startService(a(3));
    }

    private void q()
    {
        a("activateSelf", "");
        Object obj = a;
        if (obj != null)
        {
            if (((ecz) (obj)).b() == 4)
            {
                ((ecz) (obj)).p();
            }
            ((ecz) (obj)).r();
        }
        obj = j;
        int i1;
        boolean flag;
        if (!j.isWiredHeadsetOn() && "speaker".equals(c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((AudioManager) (obj)).setSpeakerphoneOn(flag);
        obj = f;
        i1 = h;
        g = (new StringBuilder(String.valueOf(obj).length() + 19)).append(((String) (obj))).append("+playId=").append(i1).toString();
        h = h + 1;
        if (n == null)
        {
            n = new edb(this);
            IntentFilter intentfilter = new IntentFilter("ready_to_play");
            intentfilter.addAction("play_started");
            intentfilter.addAction("play_paused");
            intentfilter.addAction("play_stopped");
            intentfilter.addAction("current_position");
            intentfilter.addAction("android.intent.action.HEADSET_PLUG");
            c.registerReceiver(n, intentfilter);
        }
        (new Handler(c.getMainLooper())).postDelayed(o, 10000L);
        a(this);
    }

    private void r()
    {
        a("deactivateSelf", "");
        if (n != null)
        {
            c.unregisterReceiver(n);
            n = null;
        }
        AudioManager audiomanager = j;
        boolean flag;
        if (!j.isWiredHeadsetOn() && "speaker".equals(c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        audiomanager.setSpeakerphoneOn(flag);
        b(0);
        if (b != null)
        {
            b.a(4);
        }
        a(((ecz) (null)));
    }

    public Intent a(int i1)
    {
        Intent intent = new Intent(c, com/google/android/apps/hangouts/service/AudioPlayerService);
        intent.putExtra("op", i1);
        intent.putExtra("play_id", g);
        return intent;
    }

    public String a()
    {
        return f;
    }

    public void a(Intent intent)
    {
        String s = intent.getAction();
        if (!s.equals("android.intent.action.HEADSET_PLUG")) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (intent.getIntExtra("state", 0) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            m();
        } else
        {
            j.setSpeakerphoneOn(false);
        }
        if (b != null)
        {
            b.a(2);
        }
        if (k != null)
        {
            AudioAttachmentView.a(k);
        }
_L4:
        return;
_L2:
        if (!g.equals(intent.getStringExtra("play_id")))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.equals("ready_to_play"))
        {
            a("onReadyToPlay", "");
            l = intent.getIntExtra("duration_in_milliseconds", 0);
            m = 0;
            o();
            return;
        }
        if (!s.equals("play_started"))
        {
            break; /* Loop/switch isn't completed */
        }
        a("onPlayStarted", "");
        a("sendRegister", "");
        c.startService(a(6));
        b(4);
        if (b != null)
        {
            b.a(3);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s.equals("play_paused"))
        {
            break; /* Loop/switch isn't completed */
        }
        a("onPlayPaused", "");
        a("sendUnregister", "");
        c.startService(a(7));
        b(5);
        if (b != null)
        {
            b.a(4);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (s.equals("play_stopped"))
        {
            a("onPlayStopped", "");
            r();
            return;
        }
        if (s.equals("current_position"))
        {
            a("onCurrentPosition", "");
            m = intent.getIntExtra("position_in_milliseconds", 0);
            l = intent.getIntExtra("duration_in_milliseconds", 0);
            if (k != null && AudioAttachmentView.b(k))
            {
                AudioAttachmentView.a(k);
                return;
            }
        } else
        {
            intent = String.valueOf(s);
            if (intent.length() != 0)
            {
                intent = "Received unrecognized broadcast action: ".concat(intent);
            } else
            {
                intent = new String("Received unrecognized broadcast action: ");
            }
            ebw.f("Babel", intent);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a(AudioAttachmentView audioattachmentview)
    {
        k = audioattachmentview;
    }

    public void a(edd edd1)
    {
        a("preloadAudioDataSourceIfNecessary", "");
        if (b() == 0 && edd1 != null && !b(d, i))
        {
            b(1);
            edd1.a();
        }
    }

    public void a(String s, long l1)
    {
        if (AudioAttachmentView.g())
        {
            String s1 = d;
            a("setAudioDataSource", (new StringBuilder(String.valueOf(s).length() + 41 + String.valueOf(s1).length())).append("new audioStreamUrl is ").append(s).append(" audioStreamUrl is ").append(s1).toString());
        }
        if (b(s, l1)) goto _L2; else goto _L1
_L1:
        d = null;
_L4:
        return;
_L2:
        switch (e)
        {
        case 3: // '\003'
        default:
            s = String.valueOf(c(e));
            if (s.length() != 0)
            {
                s = "Unexpected state in setAudioDataSource: ".concat(s);
            } else
            {
                s = new String("Unexpected state in setAudioDataSource: ");
            }
            ebw.f("Babel", s);
            return;

        case 0: // '\0'
            d = s;
            i = l1;
            return;

        case 1: // '\001'
            d = s;
            i = l1;
            b(0);
            return;

        case 2: // '\002'
            d = s;
            i = l1;
            n();
            b(3);
            return;

        case 4: // '\004'
        case 5: // '\005'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s, String s1)
    {
        if (AudioAttachmentView.g())
        {
            String s2 = f;
            String s3 = g;
            String s4 = c(e);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 27 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s1).length())).append(s).append(" messageId:").append(s2).append(" playId:").append(s3).append(" state:").append(s4).append(" ").append(s1).toString());
        }
    }

    public void a(boolean flag)
    {
        if (j.isWiredHeadsetOn())
        {
            return;
        }
        if (flag)
        {
            j.setSpeakerphoneOn(false);
            return;
        } else
        {
            m();
            return;
        }
    }

    public int b()
    {
        return e;
    }

    public String c()
    {
        return c.getSharedPreferences("AudioAttachment", 0).getString("output", "speaker");
    }

    public void d()
    {
        if (j.isWiredHeadsetOn())
        {
            ebw.f("Babel", "toggleAudioOutput: isWiredHeadset is true.");
        } else
        {
            if ("speaker".equals(c()))
            {
                a("earpiece");
                j.setSpeakerphoneOn(false);
            } else
            {
                a("speaker");
                j.setSpeakerphoneOn(true);
            }
            if (b != null)
            {
                b.a(2);
                return;
            }
        }
    }

    public boolean e()
    {
        int i1 = b();
        return (i1 == 1 || i1 == 4 || i1 == 3) && !j.isWiredHeadsetOn();
    }

    public boolean f()
    {
        return j.isWiredHeadsetOn();
    }

    public boolean g()
    {
        return b() == 4;
    }

    public int h()
    {
        return l;
    }

    public int i()
    {
        return m;
    }

    public void j()
    {
        a("stopPlayback", "");
        r();
        a("sendStop", "");
        c.startService(a(5));
    }

    public void k()
    {
        a("playAudio", "");
        switch (e)
        {
        case 4: // '\004'
        default:
            String s = String.valueOf(c(e));
            if (s.length() != 0)
            {
                s = "Unexpected state in playAudio: ".concat(s);
            } else
            {
                s = new String("Unexpected state in playAudio: ");
            }
            ebw.f("Babel", s);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 0: // '\0'
            if (b(d, i))
            {
                q();
                n();
                b(3);
                return;
            }
            if (k != null && AudioAttachmentView.c(k) != null)
            {
                q();
                AudioAttachmentView.c(k).a();
                b(2);
                return;
            } else
            {
                ebw.f("Babel", "No audioUrl, and no audioUrlFetcher.");
                b(0);
                return;
            }

        case 1: // '\001'
            q();
            b(2);
            return;

        case 5: // '\005'
            o();
            return;
        }
    }

    public void l()
    {
        a("pauseAudio", "");
        if (e == 4)
        {
            p();
        }
    }
}
