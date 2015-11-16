// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cju extends dgp
{

    final dhi a;
    final String b;
    final ang c;
    final int d;
    final BabelHomeActivity e;

    public cju(BabelHomeActivity babelhomeactivity, dhi dhi1, String s, ang ang1, int i)
    {
        e = babelhomeactivity;
        a = dhi1;
        b = s;
        c = ang1;
        d = i;
        super();
    }

    public void a(int i, ani ani1, dcg dcg1, dgu dgu)
    {
        if (i != a.a())
        {
            return;
        }
        RealTimeChatService.b(this);
        if (dcg1 == null)
        {
            ani1 = b;
            ebw.g("Babel", (new StringBuilder(String.valueOf(ani1).length() + 64)).append("creating conversation with ").append(ani1).append(" resulting in null ConversationResult").toString());
            return;
        } else
        {
            dcg1 = new aih(dcg1.a, 0);
            dcg1.d = true;
            dcg1.f = c;
            dcg1.k = d;
            dgu = new Intent();
            dgu.putExtra("conversation_id", ((aih) (dcg1)).a);
            dgu.putExtra("android.intent.extra.TEXT", c.b);
            dgu.putExtra("draft_subject", c.c);
            BabelHomeActivity.a(e, dcg1, dgu, ani1.h());
            return;
        }
    }
}
