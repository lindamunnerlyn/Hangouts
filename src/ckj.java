// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public class ckj extends bka
    implements biv, dih
{

    public final gmo m;
    public ConversationListFragment n;

    public ckj()
    {
        m = (new gng(this, q)).a(p);
    }

    public void a(aih aih1)
    {
        Intent intent = g.a(m.a(), aih1.a, aih1.b);
        intent.putExtra("conversation_parameters", aih1);
        intent.putExtra("opened_from_impression", 1634);
        startActivity(intent);
    }

    public void a(Intent intent)
    {
        throw new UnsupportedOperationException();
    }

    public void a(cey cey, String s, int i, long l)
    {
        throw new UnsupportedOperationException();
    }

    public void a(dsn dsn)
    {
        throw new UnsupportedOperationException();
    }

    public void a(dsn dsn, dsn dsn1)
    {
        throw new UnsupportedOperationException();
    }

    public void a(String s, boolean flag, int i, int k)
    {
        throw new UnsupportedOperationException();
    }

    public boolean a(String s)
    {
        return bnd.a(dbf.e(m.a()), s);
    }

    public void j()
    {
    }

    public void l_()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fv);
        n = (ConversationListFragment)t_().a(h.az);
        n.a(this);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            int i = g.dt;
            getWindow().setStatusBarColor(getResources().getColor(i));
        }
    }
}
