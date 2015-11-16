// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.invites.offnetwork.impl.OffnetworkInviteActivity;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bxj extends dhy
{

    private final Context a;
    private final String b;
    private final String c;
    private final aoa d;
    private bxf e;

    bxj(Context context, String s, String s1)
    {
        a = context;
        b = s;
        c = s1;
        d = dcn.e(((gqu)hlp.a(context, gqu)).a());
    }

    public static String a(aoa aoa1)
    {
        String s1 = g.a(g.nU, "babel_offnetwork_invite_canned_text_hangouts_website", "plus.google.com/hangouts/app/conversation");
        String s = s1;
        if (g.a(g.nU, "babel_enable_viral_flow_v1", true))
        {
            aoa1 = aoa1.b().a;
            s = (new StringBuilder(String.valueOf(s1).length() + 4 + String.valueOf(aoa1).length())).append(s1).append("?pi=").append(aoa1).toString();
        }
        return s;
    }

    private void a(String s, aoa aoa1)
    {
        aoa aoa2 = dcn.a(aoa1);
        if (e != null)
        {
            s = a.getString(h._fldif, new Object[] {
                s
            });
            g.a(null, 1898);
            e.a(s);
            return;
        }
        int i;
        if (aoa1.p())
        {
            i = aoa1.h();
        } else
        if (aoa2 != null)
        {
            i = aoa2.h();
        } else
        {
            i = -1;
        }
        a.startActivity(OffnetworkInviteActivity.a(c, bhv.b(b), aoa1.h(), i, s));
    }

    public void a(int i, aoa aoa1, did did1)
    {
        did1 = did1.c();
        if (did1 instanceof cys)
        {
            String s = ((cys)did1).g;
            did1 = s;
            if (TextUtils.isEmpty(s))
            {
                did1 = a(aoa1);
            }
            a(((String) (did1)), aoa1);
            RealTimeChatService.b(this);
        }
    }

    public void a(int i, aoa aoa1, dmf dmf, dcx dcx)
    {
        if (dmf instanceof cwk)
        {
            a(a(aoa1), aoa1);
            RealTimeChatService.b(this);
        }
    }

    void a(Context context, int i)
    {
        e = (bxf)hlp.b(context, bxf);
        if (bhv.a(b))
        {
            bgk.a(new bxl(context, d, b), null).a();
        } else
        {
            context = bhv.b(b);
            if (!TextUtils.isEmpty(context))
            {
                if (i == bxk.c)
                {
                    String s = bhv.b(b);
                    RealTimeChatService.a(this);
                    RealTimeChatService.u(d, s);
                }
                if (i == bxk.a)
                {
                    Intent intent = g.c(OffnetworkInviteActivity.a(c, context, -1, d.h(), null));
                    a.startActivity(intent);
                }
                if (i == bxk.b)
                {
                    context = g.c(BabelGatewayActivity.a(-1, "", context, "", false, null));
                    context.putExtra("sms_accts_only", true);
                    a.startActivity(context);
                    return;
                }
            } else
            {
                context = String.valueOf(b);
                if (context.length() != 0)
                {
                    context = "OffnetworkInvite.invite: invalid phone number ".concat(context);
                } else
                {
                    context = new String("OffnetworkInvite.invite: invalid phone number ");
                }
                eev.g("Babel_OffnetworkInvite", context);
                return;
            }
        }
    }
}
