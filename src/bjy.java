// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class bjy extends hhu
{

    private boolean a;
    private boolean b;
    private final Handler c = new bjz(this);

    public bjy()
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
            view.findViewById(h.dr).setVisibility(8);
            view.findViewById(h.dq).setVisibility(0);
        }
    }

    public void displayDeleteConversationDialog(int i)
    {
        bff bff1 = bff.a(getString(l.iD), getString(l.iC), getString(l.iB), getString(l.T));
        bff1.setTargetFragment(this, 0);
        bff1.getArguments().putInt("account_id", i);
        bff1.a(getFragmentManager(), "delete_conversation");
    }

    public ani getAccountForConversationDeletion(Bundle bundle)
    {
        bundle = dbf.e(bundle.getInt("account_id"));
        if (bundle == null)
        {
            ebw.g("Babel", "Delete conversation called for unknown account");
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
        ebr.a((TextView)view.findViewById(h.dr), view.findViewById(0x1020004), i, j, 0);
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
            view.findViewById(h.dr).setVisibility(0);
            view.findViewById(h.dq).setVisibility(8);
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
