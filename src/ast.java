// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class ast
    implements asb, fsn, gqq, hjt, hjv, hkb, hke
{

    private final Context a;
    private final int b;
    private gqr c;
    private boolean d;

    ast(Context context, hjm hjm1, int i)
    {
        a = context;
        b = i;
        hjm1.a(this);
        c = (gqr)hgx.a(context, gqr);
    }

    public String a()
    {
        String s = String.valueOf(getClass().getName());
        int i = b;
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    public void a(amf amf1, atd atd1)
    {
        Object obj;
        boolean flag;
        obj = hgx.b(a);
        switch (asu.a[atd1.ordinal()])
        {
        default:
            amf1 = String.valueOf(atd1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(amf1).length() + 27)).append("Unknown conversation type: ").append(amf1).toString());

        case 4: // '\004'
            break MISSING_BLOCK_LABEL_242;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            flag = amf1.g();
            break;
        }
_L1:
        if (flag)
        {
            int i = b;
            ebw.c("Babel_ConvCreator", (new StringBuilder(50)).append("Gaia ID resolution needed; request ID: ").append(i).toString());
            atd1 = (gmo)((hgx) (obj)).a(gmo);
            obj = (bzw)((hgx) (obj)).a(bzw);
            String s = String.valueOf("gaia_id_resolution");
            i = b;
            amf1 = ((bzw) (obj)).a((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString(), atd1.a(), amf1);
            if (!d)
            {
                c.a(this);
                d = true;
            }
            c.b(amf1);
            return;
        } else
        {
            ebw.c("Babel_ConvCreator", "No Gaia ID resolution needed");
            ((asc)((hgx) (obj)).a(asc)).a(true, amf1);
            return;
        }
        flag = false;
          goto _L1
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            ebw.c("Babel_ConvCreator", "Gaia ID resolver restored from saved state");
            if (bundle.getBoolean("listener_registered"))
            {
                c.a(this);
                d = true;
            }
        }
    }

    public void a(String s, grk grk1, grh grh)
    {
        grh = String.valueOf("gaia_id_resolution");
        int i = b;
        if (s.equals((new StringBuilder(String.valueOf(grh).length() + 11)).append(grh).append(i).toString()))
        {
            int j = b;
            ebw.c("Babel_ConvCreator", (new StringBuilder(70)).append("Gaia ID resolution background task finished for request ID ").append(j).toString());
            boolean flag;
            if (grk1 != null)
            {
                s = (amf)grk1.d().getSerializable("hangouts_contact");
            } else
            {
                s = null;
            }
            grh = (asc)hgx.b(a).a(asc);
            if (grk1 != null && !grk1.f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            grh.a(flag, s);
            c.b(this);
            d = false;
        }
    }

    public void b(Bundle bundle)
    {
        ebw.c("Babel_ConvCreator", "Saving state of gaia ID resolver");
        bundle.putBoolean("listener_registered", d);
    }

    public void e_()
    {
        c.b(this);
    }
}
