// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.telecom.DisconnectCause;
import android.telephony.PhoneNumberUtils;
import java.lang.reflect.Method;

final class dvl
    implements dts
{

    private final dtr a;
    private final Handler b = new Handler();
    private int c;
    private int d;
    private final Runnable e = new dvm(this);

    dvl(dtr dtr1)
    {
        d = 0;
        a = dtr1;
    }

    private void a(long l)
    {
        b.postDelayed(e, l);
    }

    private void b()
    {
        d = 3;
        b.removeCallbacksAndMessages(null);
    }

    void a()
    {
        dtz dtz1 = a.a();
        Object obj;
        if (dtz1 != null && dtz1.getState() == 4)
        {
            obj = dtz1.f().g();
        } else
        {
            obj = null;
        }
        if (obj != null && c < ((String) (obj)).length())
        {
            char c1 = ((String) (obj)).charAt(c);
            String s = String.valueOf(ebw.b(String.valueOf(c1)));
            if (s.length() != 0)
            {
                s = "TelePostDialHelper.processNextCharacter, processing: ".concat(s);
            } else
            {
                s = new String("TelePostDialHelper.processNextCharacter, processing: ");
            }
            ebw.e("Babel_telephony", s);
            c = c + 1;
            if (PhoneNumberUtils.is12Key(c1))
            {
                a.a(c1);
                a(bpd.O());
            } else
            if (c1 == ',')
            {
                a(3000L);
            } else
            if (c1 == ';')
            {
                dtz1.setPostDialWait(((String) (obj)).substring(c));
                d = 2;
            } else
            {
                a(0L);
            }
        } else
        {
            b();
            return;
        }
        obj = dtz1.getClass().getDeclaredMethod("setNextPostDialWaitChar", new Class[] {
            Character.TYPE
        });
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((Method) (obj)).invoke(dtz1, new Object[] {
            Character.valueOf(c1)
        });
        return;
        obj;
        try
        {
            obj = dtz1.getClass().getDeclaredMethod("setNextPostDialChar", new Class[] {
                Character.TYPE
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(obj);
            ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 58)).append("setNextPostDialCharacter, calling setNextPostDial failed: ").append(((String) (obj))).toString());
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(dtr dtr1, int i)
    {
        if (i == 4 && d == 0)
        {
            d = 1;
            a();
        }
    }

    public void a(dtr dtr1, DisconnectCause disconnectcause)
    {
        b();
    }

    void a(boolean flag)
    {
label0:
        {
            if (d == 2)
            {
                if (!flag)
                {
                    break label0;
                }
                d = 1;
                a();
            }
            return;
        }
        b();
    }
}
