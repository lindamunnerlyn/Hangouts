// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public class clo extends bkm
    implements bjh, djs
{

    public final gqu n;
    public ConversationListFragment o;

    public clo()
    {
        n = (new grn(this, r)).a(q);
    }

    public void a(aia aia1)
    {
        Intent intent = g.a(n.a(), aia1.a, aia1.b);
        intent.putExtra("conversation_parameters", aia1);
        intent.putExtra("opened_from_impression", 1634);
        startActivity(intent);
    }

    public void a(Intent intent)
    {
        throw new UnsupportedOperationException();
    }

    public void a(cgd cgd, String s, int i, long l)
    {
        throw new UnsupportedOperationException();
    }

    public void a(dvg dvg)
    {
        throw new UnsupportedOperationException();
    }

    public void a(dvg dvg, dvg dvg1)
    {
        throw new UnsupportedOperationException();
    }

    public void a(String s, boolean flag, int i, int k)
    {
        throw new UnsupportedOperationException();
    }

    public boolean a(String s)
    {
        return bnk.a(dcn.e(n.a()), s);
    }

    public void j()
    {
    }

    public void m_()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.ft);
        o = (ConversationListFragment)u_().a(h.au);
        o.a(this);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            int i = g.ds;
            getWindow().setStatusBarColor(getResources().getColor(i));
        }
    }
}
