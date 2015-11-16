// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class ati
    implements asq, gvb, hma, hon, hop, hov, hoy, hoz
{

    private final Context a;
    private final int b;
    private final hlp c;
    private gvc d;
    private boolean e;

    ati(Context context, hof hof1, int i)
    {
        a = context;
        b = i;
        c = hlp.b(context);
        hof1.a(this);
    }

    public String a()
    {
        String s = String.valueOf(getClass().getName());
        int i = b;
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    public void a(amx amx1, atu atu1)
    {
        boolean flag;
        switch (atj.a[atu1.ordinal()])
        {
        default:
            amx1 = String.valueOf(atu1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(amx1).length() + 27)).append("Unknown conversation type: ").append(amx1).toString());

        case 4: // '\004'
            break MISSING_BLOCK_LABEL_240;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            flag = amx1.g();
            break;
        }
_L1:
        if (flag)
        {
            int i = b;
            eev.c("Babel_ConvCreator", (new StringBuilder(50)).append("Gaia ID resolution needed; request ID: ").append(i).toString());
            atu1 = (gqu)c.a(gqu);
            caz caz1 = (caz)c.a(caz);
            String s = String.valueOf("gaia_id_resolution");
            i = b;
            amx1 = caz1.a((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString(), atu1.a(), amx1);
            if (!e)
            {
                d.a(this);
                e = true;
            }
            d.b(amx1);
            return;
        } else
        {
            eev.c("Babel_ConvCreator", "No Gaia ID resolution needed");
            ((asr)c.a(asr)).a(true, amx1);
            return;
        }
        flag = false;
          goto _L1
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        d = (gvc)hlp1.a(gvc);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            eev.c("Babel_ConvCreator", "Gaia ID resolver restored from saved state");
            if (bundle.getBoolean("listener_registered"))
            {
                d.a(this);
                e = true;
            }
        }
    }

    public void a(String s, gvv gvv1, gvs gvs)
    {
        gvs = String.valueOf("gaia_id_resolution");
        int i = b;
        if (s.equals((new StringBuilder(String.valueOf(gvs).length() + 11)).append(gvs).append(i).toString()))
        {
            int j = b;
            eev.c("Babel_ConvCreator", (new StringBuilder(70)).append("Gaia ID resolution background task finished for request ID ").append(j).toString());
            boolean flag;
            if (gvv1 != null)
            {
                s = (amx)gvv1.d().getSerializable("hangouts_contact");
            } else
            {
                s = null;
            }
            gvs = (asr)hlp.b(a).a(asr);
            if (gvv1 != null && !gvv1.f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gvs.a(flag, s);
            d.b(this);
            e = false;
        }
    }

    public void b(Bundle bundle)
    {
        eev.c("Babel_ConvCreator", "Saving state of gaia ID resolver");
        bundle.putBoolean("listener_registered", e);
    }

    public void f_()
    {
        d.b(this);
    }
}
