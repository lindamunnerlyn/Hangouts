// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ckz extends dhy
{

    final dir a;
    final String b;
    final any c;
    final int d;
    final BabelHomeActivity e;

    public ckz(BabelHomeActivity babelhomeactivity, dir dir1, String s, any any1, int i)
    {
        e = babelhomeactivity;
        a = dir1;
        b = s;
        c = any1;
        d = i;
        super();
    }

    public void a(int i, aoa aoa1, ddo ddo1, did did)
    {
        if (i != a.a())
        {
            return;
        }
        RealTimeChatService.b(this);
        if (ddo1 == null)
        {
            aoa1 = b;
            eev.g("Babel", (new StringBuilder(String.valueOf(aoa1).length() + 64)).append("creating conversation with ").append(aoa1).append(" resulting in null ConversationResult").toString());
            return;
        } else
        {
            ddo1 = new aia(ddo1.a, 0);
            ddo1.d = true;
            ddo1.f = c;
            ddo1.k = d;
            did = new Intent();
            did.putExtra("conversation_id", ((aia) (ddo1)).a);
            did.putExtra("android.intent.extra.TEXT", c.b);
            did.putExtra("draft_subject", c.c);
            BabelHomeActivity.a(e, ddo1, did, aoa1.h());
            return;
        }
    }
}
