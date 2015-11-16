// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.WrapperListAdapter;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;
import java.util.ArrayList;
import java.util.Iterator;

public final class biq extends BaseAdapter
    implements WrapperListAdapter
{

    final bim a;
    final ConversationInviteListFragment b;
    private final ArrayList c = new ArrayList();

    public biq(ConversationInviteListFragment conversationinvitelistfragment, bim bim1)
    {
        b = conversationinvitelistfragment;
        super();
        a = bim1;
        a(bim1.a());
        a.registerDataSetObserver(new bir(this, conversationinvitelistfragment));
    }

    void a(Cursor cursor)
    {
        c.clear();
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        c.add(new bip(l.eI, g.gv, 0));
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        if (cursor.getInt(27) != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (cursor.getPosition() == 0)
        {
            c.remove(0);
        }
        c.add(new bip(l.fh, g.gv, cursor.getPosition()));
_L2:
        return;
        if (cursor.moveToNext()) goto _L3; else goto _L4
_L4:
    }

    public int getCount()
    {
        return a.getCount() + c.size();
    }

    public Object getItem(int i)
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bip bip1 = (bip)iterator.next();
            if (bip1.a == i)
            {
                return bip1;
            }
            if (bip1.a < i)
            {
                i--;
            }
        } while (true);
        return a.getItem(i);
    }

    public long getItemId(int i)
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bip bip1 = (bip)iterator.next();
            if (bip1.a == i)
            {
                return -1L;
            }
            if (bip1.a < i)
            {
                i--;
            }
        } while (true);
        return a.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bip bip1 = (bip)iterator.next();
            if (bip1.a == i)
            {
                return a.getViewTypeCount();
            }
            if (bip1.a < i)
            {
                i--;
            }
        } while (true);
        return a.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bip bip1 = (bip)iterator.next();
            if (bip1.a == i)
            {
                view = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(bip1.c, viewgroup, false);
                ((TextView)view.findViewById(h.fo)).setText(bip1.b);
                viewgroup = view.findViewById(h.aT);
                if (viewgroup != null)
                {
                    viewgroup.setVisibility(8);
                }
                return view;
            }
            if (bip1.a < i)
            {
                i--;
            }
        } while (true);
        return a.getView(i, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return a.getViewTypeCount() + 1;
    }

    public ListAdapter getWrappedAdapter()
    {
        return a;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
