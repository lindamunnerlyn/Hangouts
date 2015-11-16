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

public final class bie extends BaseAdapter
    implements WrapperListAdapter
{

    final ConversationInviteListFragment a;
    private final ArrayList b = new ArrayList();
    private final bia c;

    public bie(ConversationInviteListFragment conversationinvitelistfragment, bia bia1)
    {
        a = conversationinvitelistfragment;
        super();
        c = bia1;
        a(bia1.a());
        c.registerDataSetObserver(new bif(this, conversationinvitelistfragment));
    }

    static bia a(bie bie1)
    {
        return bie1.c;
    }

    private void a(Cursor cursor)
    {
        b.clear();
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        b.add(new bid(l.eZ, g.gz, 0));
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        if (cursor.getInt(27) != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (cursor.getPosition() == 0)
        {
            b.remove(0);
        }
        b.add(new bid(l.fy, g.gz, cursor.getPosition()));
_L2:
        return;
        if (cursor.moveToNext()) goto _L3; else goto _L4
_L4:
    }

    static void a(bie bie1, Cursor cursor)
    {
        bie1.a(cursor);
    }

    public int getCount()
    {
        return c.getCount() + b.size();
    }

    public Object getItem(int i)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bid bid1 = (bid)iterator.next();
            if (bid1.a == i)
            {
                return bid1;
            }
            if (bid1.a < i)
            {
                i--;
            }
        } while (true);
        return c.getItem(i);
    }

    public long getItemId(int i)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bid bid1 = (bid)iterator.next();
            if (bid1.a == i)
            {
                return -1L;
            }
            if (bid1.a < i)
            {
                i--;
            }
        } while (true);
        return c.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bid bid1 = (bid)iterator.next();
            if (bid1.a == i)
            {
                return c.getViewTypeCount();
            }
            if (bid1.a < i)
            {
                i--;
            }
        } while (true);
        return c.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bid bid1 = (bid)iterator.next();
            if (bid1.a == i)
            {
                view = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(bid1.c, viewgroup, false);
                ((TextView)view.findViewById(h.fG)).setText(bid1.b);
                viewgroup = view.findViewById(h.aZ);
                if (viewgroup != null)
                {
                    viewgroup.setVisibility(8);
                }
                return view;
            }
            if (bid1.a < i)
            {
                i--;
            }
        } while (true);
        return c.getView(i, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return c.getViewTypeCount() + 1;
    }

    public ListAdapter getWrappedAdapter()
    {
        return c;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
