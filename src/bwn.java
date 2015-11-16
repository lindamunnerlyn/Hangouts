// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.invite.OffnetworkInviteActivity;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.Iterator;

public final class bwn extends dgp
{

    private final ani a;
    private final String b;
    private final String c;
    private final String d;
    private final bwr e;
    private bwm f;
    private Context g;

    public bwn(ani ani1, String s, String s1, String s2, bwr bwr1, Context context)
    {
        a = ani1;
        b = s2;
        c = s1;
        d = s;
        e = bwr1;
        g = context;
    }

    public static String a(ani ani1)
    {
        String s1 = g.a(g.nS, "babel_offnetwork_invite_canned_text_hangouts_website", "plus.google.com/hangouts/app/conversation");
        String s = s1;
        if (g.a(g.nS, "babel_enable_viral_flow_v1", true))
        {
            ani1 = ani1.b().a;
            s = (new StringBuilder(String.valueOf(s1).length() + 4 + String.valueOf(ani1).length())).append(s1).append("?pi=").append(ani1).toString();
        }
        return s;
    }

    private void a(String s, ani ani1)
    {
        ani ani2 = dbf.a(ani1);
        if (f != null)
        {
            s = g.getResources().getString(l.hv, new Object[] {
                s
            });
            g.a(null, 1898);
            f.a(s);
            return;
        }
        int i;
        if (ani1.r())
        {
            i = ani1.h();
        } else
        if (ani2 != null)
        {
            i = ani2.h();
        } else
        {
            i = -1;
        }
        g.startActivity(OffnetworkInviteActivity.a(b, bhj.b(c), ani1.h(), i, s));
    }

    public static boolean a(amf amf1, atd atd1)
    {
        switch (bwo.a[atd1.ordinal()])
        {
        default:
            amf1 = String.valueOf(atd1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(amf1).length() + 27)).append("Unknown conversation type: ").append(amf1).toString());

        case 1: // '\001'
            if (!amf1.b().isEmpty())
            {
                return false;
            }
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            for (amf1 = amf1.j().iterator(); amf1.hasNext();)
            {
                if (!((ame)amf1.next()).f())
                {
                    return false;
                }
            }

            return true;

        case 4: // '\004'
            return false;
        }
    }

    public void a(int i, ani ani1, dgu dgu1)
    {
        dgu1 = dgu1.c();
        if (dgu1 instanceof cwo)
        {
            String s = ((cwo)dgu1).g;
            dgu1 = s;
            if (TextUtils.isEmpty(s))
            {
                dgu1 = a(ani1);
            }
            a(((String) (dgu1)), ani1);
            RealTimeChatService.b(this);
        }
    }

    public void a(int i, ani ani1, dko dko, dbo dbo)
    {
        if (dko instanceof cug)
        {
            a(a(ani1), ani1);
            RealTimeChatService.b(this);
        }
    }

    public void a(int i, bwm bwm1, hgx hgx1)
    {
        f = bwm1;
        if (bhj.a(c))
        {
            bfy.a(new bwq(g, hgx1, a, c), null).a();
        } else
        {
            bwm1 = bhj.b(c);
            if (!TextUtils.isEmpty(bwm1))
            {
                if (i == bwp.c)
                {
                    hgx1 = bhj.b(c);
                    RealTimeChatService.a(this);
                    RealTimeChatService.u(a, hgx1);
                }
                if (i == bwp.a)
                {
                    hgx1 = g.c(OffnetworkInviteActivity.a(b, bwm1, -1, a.h(), null));
                    g.startActivity(hgx1);
                }
                if (i == bwp.b)
                {
                    bwm1 = g.c(BabelGatewayActivity.a(-1, "", bwm1, "", false, null));
                    bwm1.putExtra("sms_accts_only", true);
                    g.startActivity(bwm1);
                    return;
                }
            } else
            {
                bwm1 = String.valueOf(c);
                if (bwm1.length() != 0)
                {
                    bwm1 = "OffnetworkInvite.invite: invalid phone number ".concat(bwm1);
                } else
                {
                    bwm1 = new String("OffnetworkInvite.invite: invalid phone number ");
                }
                ebw.g("Babel", bwm1);
                return;
            }
        }
    }

    public void a(ap ap)
    {
        if (c == null)
        {
            Toast.makeText(g, l.ap, 1).show();
            return;
        }
        if (e == bwr.a && !a.q())
        {
            g.a(a, 1860);
            ap = hgx.b(g);
            bwm bwm1 = (bwm)ap.b(bwm);
            a(bwp.c, bwm1, ((hgx) (ap)));
            return;
        } else
        {
            bws.a(b, d, c, e).a(ap, "INVITE_DIALOG_FRAGMENT");
            return;
        }
    }
}
