// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;

public final class cpb
    implements biv
{

    final ShareIntentActivity a;

    public cpb(ShareIntentActivity shareintentactivity)
    {
        a = shareintentactivity;
        super();
    }

    public void a(aih aih1)
    {
        Intent intent = g.a(ShareIntentActivity.a(a).h(), aih1.a, aih1.b);
        intent.putExtra("conversation_parameters", aih1);
        Intent intent1 = a.getIntent();
        intent1.putExtra("conversation_id", aih1.a);
        dzj.a("ShareIntentActivity.openConversation", intent1);
        intent.putExtra("share_intent", intent1);
        intent.setFlags(0x800000);
        a.startActivityForResult(intent, 0);
        a.overridePendingTransition(g.cs, g.ct);
    }

    public void a(Intent intent)
    {
        gbh.a("Should not get called");
    }

    public void a(cey cey, String s, int i, long l)
    {
        gbh.a("Should not get called");
    }

    public void a(dsn dsn)
    {
        gbh.a("Should not get called");
    }

    public void a(dsn dsn, dsn dsn1)
    {
        gbh.a("Should not get called");
    }

    public void a(String s, boolean flag, int i, int k)
    {
        gbh.a("Should not get called");
    }

    public boolean a(String s)
    {
        return false;
    }

    public void j()
    {
        gbh.a("Should not get called");
    }

    public void l_()
    {
        gbh.a("Should not get called");
    }
}
