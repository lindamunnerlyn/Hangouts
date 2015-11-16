// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;

public final class cqr
    implements bjh
{

    final ShareIntentActivity a;

    public cqr(ShareIntentActivity shareintentactivity)
    {
        a = shareintentactivity;
        super();
    }

    public void a(aia aia1)
    {
        Intent intent = g.a(a.j.h(), aia1.a, aia1.b);
        intent.putExtra("conversation_parameters", aia1);
        Intent intent1 = a.getIntent();
        intent1.putExtra("conversation_id", aia1.a);
        ecn.a("ShareIntentActivity.openConversation", intent1);
        intent.putExtra("share_intent", intent1);
        intent.setFlags(0x800000);
        a.startActivityForResult(intent, 0);
        a.overridePendingTransition(g.cr, g.cs);
    }

    public void a(Intent intent)
    {
        gdv.a("Should not get called");
    }

    public void a(cgd cgd, String s, int i, long l)
    {
        gdv.a("Should not get called");
    }

    public void a(dvg dvg)
    {
        gdv.a("Should not get called");
    }

    public void a(dvg dvg, dvg dvg1)
    {
        gdv.a("Should not get called");
    }

    public void a(String s, boolean flag, int i, int k)
    {
        gdv.a("Should not get called");
    }

    public boolean a(String s)
    {
        return false;
    }

    public void j()
    {
        gdv.a("Should not get called");
    }

    public void m_()
    {
        gdv.a("Should not get called");
    }
}
