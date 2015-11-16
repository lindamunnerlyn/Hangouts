// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class bkk extends hmm
{

    private boolean a;
    private boolean b;
    private final Handler c = new bkl(this);

    public bkk()
    {
    }

    protected void Y()
    {
        if (isAdded() && !isPaused())
        {
            View view = getView();
            if (view != null)
            {
                a(view);
            }
        }
    }

    protected void Z()
    {
        c.removeMessages(0);
    }

    public void a(View view)
    {
        if (isEmpty())
        {
            view.findViewById(0x1020004).setVisibility(0);
            view.findViewById(h.df).setVisibility(8);
            view.findViewById(h.de).setVisibility(0);
        }
    }

    public void displayDeleteConversationDialog(int i)
    {
        bfr bfr1 = bfr.a(getString(l.hX), getString(l.hW), getString(l.hV), getString(l.Q));
        bfr1.setTargetFragment(this, 0);
        bfr1.getArguments().putInt("account_id", i);
        bfr1.a(getFragmentManager(), "delete_conversation");
    }

    public aoa getAccountForConversationDeletion(Bundle bundle)
    {
        bundle = dcn.e(bundle.getInt("account_id"));
        if (bundle == null)
        {
            eev.g("Babel", "Delete conversation called for unknown account");
        }
        return bundle;
    }

    public abstract boolean isEmpty();

    public boolean isPaused()
    {
        return a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = true;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle, int i)
    {
        return layoutinflater.inflate(i, viewgroup, false);
    }

    public void onPause()
    {
        a = true;
        super.onPause();
    }

    public void onResume()
    {
        a = false;
        super.onResume();
    }

    public void setupEmptyView(View view, int i, int j)
    {
        eep.a((TextView)view.findViewById(h.df), view.findViewById(0x1020004), i, j, 0);
    }

    public void showContent(View view)
    {
        Z();
        view.findViewById(0x1020004).setVisibility(8);
    }

    public void showEmptyView(View view)
    {
        Z();
        if (isEmpty())
        {
            view.findViewById(0x1020004).setVisibility(0);
            view.findViewById(h.df).setVisibility(0);
            view.findViewById(h.de).setVisibility(8);
        }
    }

    public void showEmptyViewProgress(View view)
    {
        if (b)
        {
            if (!c.hasMessages(0) && isEmpty())
            {
                c.sendEmptyMessageDelayed(0, 800L);
            }
            return;
        } else
        {
            a(view);
            return;
        }
    }
}
