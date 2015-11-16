// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.database.Cursor;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.listui.SwipeableListView;

public final class bjb
    implements csk
{

    final ConversationListFragment a;
    private final csi b = new csi(this);

    public bjb(ConversationListFragment conversationlistfragment)
    {
        a = conversationlistfragment;
        super();
    }

    public android.widget.AbsListView.MultiChoiceModeListener a()
    {
        return b.a();
    }

    public void a(csi csi1, int i, boolean flag)
    {
        int j = 0;
        SparseBooleanArray sparsebooleanarray = ((SwipeableListView)a.g).getCheckedItemPositions();
        sparsebooleanarray.put(i, flag);
        int i1 = sparsebooleanarray.size();
        int k = 0;
        i = j;
        for (j = k; i < i1; j = k)
        {
            k = j;
            if (sparsebooleanarray.valueAt(i))
            {
                k = j + 1;
            }
            i++;
        }

        if (j == 0)
        {
            ConversationListFragment.p(a).c();
        }
        csi1.b();
    }

    public boolean a(MenuItem menuitem)
    {
        long al[] = ((SwipeableListView)a.g).getCheckedItemIds();
        if (al.length > 0)
        {
            ConversationListFragment.a(a, a.f, menuitem, al);
        }
        return true;
    }

    public boolean a(csi csi1, Menu menu)
    {
        ConversationListFragment.a(a, csi1);
        a.getActivity().getMenuInflater().inflate(g.hk, menu);
        ConversationListFragment.i(a).m_();
        return true;
    }

    public void b()
    {
        ConversationListFragment.a(a, null);
        ConversationListFragment.i(a).j();
    }

    public boolean b(csi csi1, Menu menu)
    {
        SparseBooleanArray sparsebooleanarray;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int j3;
        int k3;
        int k4;
        int k5;
        int l5;
        boolean flag;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        for (int i = 0; i < menu.size(); i++)
        {
            menu.getItem(i).setVisible(false);
        }

        l5 = 0;
        k = 0;
        k5 = 0;
        j1 = 0;
        k6 = 1;
        k1 = 1;
        flag = true;
        k2 = 1;
        k4 = 1;
        i2 = 1;
        l2 = 1;
        i1 = 1;
        i6 = 0;
        j = 0;
        sparsebooleanarray = ((SwipeableListView)a.g).getCheckedItemPositions();
        l6 = sparsebooleanarray.size();
        j3 = ConversationListFragment.o(a);
        i7 = ((SwipeableListView)a.g).getHeaderViewsCount();
        j7 = ((SwipeableListView)a.g).getFooterViewsCount();
        k3 = 0;
        j2 = 0;
        j6 = 1;
        l1 = 1;
        if (j3 - i7 - j7 <= 0) goto _L2; else goto _L1
_L1:
        j3 = 0;
_L7:
        k3 = j2;
        k4 = i2;
        k5 = j1;
        l5 = k;
        j6 = l1;
        flag = k2;
        i6 = j;
        l2 = i1;
        k6 = k1;
        if (j3 >= l6) goto _L2; else goto _L3
_L3:
        Object obj;
        if (!sparsebooleanarray.valueAt(j3))
        {
            break MISSING_BLOCK_LABEL_951;
        }
        l2 = j2 + 1;
        obj = ConversationListFragment.a(a, sparsebooleanarray.keyAt(j3));
        if (!(obj instanceof Cursor)) goto _L5; else goto _L4
_L4:
        obj = (Cursor)obj;
        if (obj == null) goto _L5; else goto _L6
_L6:
        long l7 = ((Cursor) (obj)).getLong(3);
        boolean flag1;
        if (((Cursor) (obj)).getInt(2) == 10)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        flag1 = g.e(((Cursor) (obj)).getInt(36));
        if (!flag1)
        {
            l1 = 0;
        }
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        if (l7 != 2L || flag1)
        {
            i2 = 0;
        } else
        {
            i2 = k1;
        }
        k1 = i1;
        if (l7 != 1L)
        {
            k1 = i1;
            if (!flag1)
            {
                k1 = 0;
            }
        }
        if (j2 != 0)
        {
            j1 = 1;
        } else
        {
            k = 1;
        }
        if (((Cursor) (obj)).getInt(15) == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        k2 = ((bjf)a.f).getItemViewType(((Cursor) (obj)).getPosition());
        if (k2 == 1 || k2 == 2)
        {
            k3 = 1;
            j = l1;
            k2 = j2;
            j2 = k;
            k = k1;
            k1 = j1;
            l1 = i1;
            j1 = k;
            k = k3;
            i1 = l2;
        } else
        {
            k2 = l2;
            int l4 = i1;
            l2 = j1;
            j1 = j;
            int l3 = k;
            j = l1;
            i1 = k2;
            k = j1;
            j1 = k1;
            l1 = l4;
            k2 = j2;
            k1 = l2;
            j2 = l3;
        }
_L8:
        k4 = j3 + 1;
        l2 = i2;
        i2 = i1;
        k3 = j2;
        i1 = j1;
        j3 = k;
        j1 = k1;
        j2 = i2;
        i2 = l1;
        k = k3;
        l1 = j;
        j = j3;
        k1 = l2;
        j3 = k4;
          goto _L7
_L2:
        if (l2 != 0 && k3 > 1 && j6 == 0)
        {
            j = 0;
        } else
        {
            j = l2;
        }
        if (l5 != 0 && i6 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (k5 != 0 && i6 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && i6 == 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (k4 != 0 && i6 == 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (k6 != 0 && i6 == 0)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (j != 0 && i6 == 0)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        csi1.a(a.getResources().getString(l.aB, new Object[] {
            Integer.valueOf(k3)
        }));
        menu.findItem(h.eE).setVisible(flag3);
        menu.findItem(h.eO).setVisible(flag4);
        menu.findItem(h.eK).setVisible(flag5);
        menu.findItem(h.eL).setVisible(flag1);
        menu.findItem(h.eP).setVisible(flag2);
        menu.findItem(h.eG).setVisible(flag6);
        menu.findItem(h.eN).setVisible(eep.a());
        return false;
_L5:
        int i4 = l1;
        l1 = i2;
        i2 = l2;
        j2 = j1;
        j1 = j;
        l2 = k;
        int i5 = i1;
        j = i4;
        i1 = i2;
        k = j1;
        j1 = i5;
        i2 = k1;
        k1 = j2;
        j2 = l2;
          goto _L8
        int j4 = l1;
        l1 = i2;
        i2 = j2;
        j2 = j1;
        j1 = j;
        int i3 = k;
        int j5 = i1;
        j = j4;
        i1 = i2;
        k = j1;
        j1 = j5;
        i2 = k1;
        k1 = j2;
        j2 = i3;
          goto _L8
    }
}
