// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.HangoutEventMessageListItemView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import com.google.android.apps.hangouts.views.OtrModificationMessageListItemView;
import com.google.android.apps.hangouts.views.SystemMessageListItemView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class aqu extends coy
{

    public static final boolean j = false;
    public static long k;
    private final bib l;
    private final eif m;
    private final MessageListAnimationManager n;
    private aqy o;
    private int p;
    private boolean q;
    private boolean r;
    private long s;
    private final eis t = new aqz();

    public aqu(bib bib1, AbsListView abslistview, MessageListAnimationManager messagelistanimationmanager, int i, boolean flag)
    {
        super(bib1.getActivity(), null);
        s = 0x7fffffffffffffffL;
        if (k == -1L)
        {
            k = g.a(g.nU, "babel_message_block_max_time_diff_ms", 0x2bf20L);
        }
        l = bib1;
        p = i;
        m = new eif(flag);
        n = messagelistanimationmanager;
        n.a(m);
        abslistview.setRecyclerListener(new aqv(this));
    }

    static bib a(aqu aqu1)
    {
        return aqu1.l;
    }

    private cbt a(cbt cbt1)
    {
        for (Iterator iterator = hlp.c(d, arb).iterator(); iterator.hasNext();)
        {
            arb arb1 = (arb)iterator.next();
            if (arb1.a())
            {
                return arb1.a(cbt1);
            }
        }

        return null;
    }

    private boolean a(boolean flag, boolean flag1)
    {
        boolean flag2;
label0:
        {
label1:
            {
                boolean flag4 = false;
                boolean flag3 = false;
                long l1 = c.getLong(6);
                String s1 = c.getString(4);
                String s2 = c.getString(3);
                dsv dsv1 = dsv.values()[c.getInt(8)];
                dsu dsu1 = dsu.values()[c.getInt(7)];
                int i = c.getInt(36);
                flag2 = flag4;
                if (c.isLast())
                {
                    break label0;
                }
                flag2 = flag4;
                if (!c.moveToNext())
                {
                    break label0;
                }
                long l2 = c.getLong(6);
                String s3 = c.getString(4);
                String s4 = c.getString(3);
                dsv dsv2 = dsv.values()[c.getInt(8)];
                dsu dsu2 = dsu.values()[c.getInt(7)];
                int i1 = c.getInt(36);
                if (flag1)
                {
                    flag1 = flag3;
                    if (l2 - l1 >= k)
                    {
                        break label1;
                    }
                }
                flag1 = flag3;
                if (i1 != i)
                {
                    break label1;
                }
                if (flag)
                {
                    flag1 = flag3;
                    if (dsv1 != dsv2)
                    {
                        break label1;
                    }
                    flag1 = flag3;
                    if (!cgd.a(s2, s1, s4, s3))
                    {
                        break label1;
                    }
                }
                flag1 = flag3;
                if (dsu1 == dsu.e)
                {
                    flag1 = flag3;
                    if (dsu2 != dsu.d)
                    {
                        flag1 = flag3;
                        if (dsu2 != dsu.b)
                        {
                            flag1 = true;
                        }
                    }
                }
            }
            c.moveToPrevious();
            flag2 = flag1;
        }
        return flag2;
    }

    public void a(long l1)
    {
        m.a(l1);
    }

    public void a(aqy aqy1)
    {
        o = aqy1;
    }

    public void a(boolean flag)
    {
        r = flag;
    }

    public Cursor b(Cursor cursor)
    {
        m.a(cursor);
        return super.b(cursor);
    }

    public void b(boolean flag)
    {
        m.a(flag);
    }

    public void c()
    {
        aoa aoa1 = l.a();
        String s1 = l.O();
        if (s != 0x7fffffffffffffffL && aoa1 != null && !TextUtils.isEmpty(s1))
        {
            eev.a("Babel", "Update message scroll time");
            RealTimeChatService.c(l.a(), l.O(), s);
            s = 0x7fffffffffffffffL;
            return;
        } else
        {
            eev.a("Babel", "Skip updating message scroll time");
            return;
        }
    }

    public void c(boolean flag)
    {
        q = flag;
    }

    public void e_()
    {
        m.a();
    }

    public int getItemViewType(int i)
    {
        c.moveToPosition(i);
        return c.getInt(8);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        Object obj1;
        int i1;
        if (!a)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!c.moveToPosition(i))
        {
            throw new IllegalStateException((new StringBuilder(44)).append("couldn't move cursor to position ").append(i).toString());
        }
        viewgroup = c.getString(10);
        obj = c.getString(9);
        cbt cbt1;
        long l1;
        boolean flag;
        try
        {
            if (!TextUtils.isEmpty(viewgroup))
            {
                Uri.parse(viewgroup).getHost().hashCode();
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                Uri.parse(((String) (obj))).getHost().hashCode();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            eev.e("Babel", (new StringBuilder(String.valueOf(viewgroup).length() + 53 + String.valueOf(obj).length())).append(" Read message info with malformed url: remote=").append(viewgroup).append(" local=").append(((String) (obj))).toString(), ((Throwable) (obj1)));
        }
        l1 = c.getLong(6);
        if (s > l1)
        {
            s = l1;
        }
        viewgroup = (LayoutInflater)d.getSystemService("layout_inflater");
        obj1 = dsv.values()[c.getInt(8)];
        if (view != null)
        {
            view = (MessageListItemWrapperView)view;
        } else
        {
            view = (MessageListItemWrapperView)viewgroup.inflate(g.gF, null);
            view.a(n);
            view.a(t);
        }
        view.b(r);
        if (c.getLong(19) != 0L)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        view.a(i1);
        l1 = getItemId(i);
        obj = m.b();
        flag = m.c(l1);
        if (obj != null && l1 == g.a(((Long) (obj)), 0L))
        {
            i1 = 1;
        } else
        if (m.b(l1))
        {
            i1 = 0;
        } else
        if (flag)
        {
            if (obj != null)
            {
                i1 = 3;
            } else
            {
                i1 = 2;
            }
        } else
        {
            i1 = 4;
        }
        view.b(i1);
        obj = view.c();
        cbt1 = a(((cbt) (obj)));
        if (cbt1 == null) goto _L2; else goto _L1
_L1:
        view.a(cbt1);
_L13:
        viewgroup = (aru)hlp.a(d, aru);
        view.a(c, l, p, viewgroup.a(l.O()));
        return view;
_L2:
        if (obj1 != dsv.c && obj1 != dsv.b)
        {
            break MISSING_BLOCK_LABEL_925;
        }
        long l2;
        boolean flag1;
        boolean flag2;
        if (obj != null)
        {
            viewgroup = (MessageListItemView)((cbt) (obj)).b();
        } else
        {
            obj = dsv.values()[getItemViewType(i)];
            if (obj == dsv.b)
            {
                i = g.gE;
            } else
            if (obj == dsv.c)
            {
                i = g.gD;
            } else
            {
                gdv.a((new StringBuilder(32)).append("unexpected position: ").append(i).toString());
                i = -1;
            }
            obj = (MessageListItemView)viewgroup.inflate(i, null);
            ((MessageListItemView) (obj)).a(l);
            ((MessageListItemView) (obj)).a(l);
            view.a(((cbt) (obj)));
            viewgroup = ((ViewGroup) (obj));
            if (o != null)
            {
                o.a(((MessageListItemView) (obj)));
                viewgroup = ((ViewGroup) (obj));
            }
        }
        if (obj1 == dsv.b)
        {
            viewgroup.a(l.a().v());
        }
        viewgroup.a(c, p, l.a(), l, q);
        l2 = c.getLong(0);
        viewgroup.setSelected(l.a(l2));
        if (p != 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag1 = a(flag1, true);
        if (!a(true, false))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        view.d(flag2);
        dsu dsu1;
        if (!c.isFirst() && c.moveToPrevious())
        {
            flag2 = a(true, false);
            c.moveToNext();
        } else
        {
            flag2 = false;
        }
        i1;
        JVM INSTR tableswitch 3 4: default 716
    //                   3 902
    //                   4 893;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_902;
_L3:
        viewgroup.b(false);
        flag1 = false;
_L6:
        viewgroup.a(flag1);
        if (!flag2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        viewgroup.c(flag1);
        viewgroup.requestLayout();
        continue; /* Loop/switch isn't completed */
_L5:
        viewgroup.b(flag1);
          goto _L6
        viewgroup.b(false);
        if (flag1)
        {
            viewgroup.u();
        }
          goto _L6
        if (obj1 == dsv.h || obj1 == dsv.i)
        {
            if (obj != null)
            {
                viewgroup = (HangoutEventMessageListItemView)((cbt) (obj)).b();
            } else
            {
                viewgroup = (HangoutEventMessageListItemView)viewgroup.inflate(g.fU, null);
                view.a(viewgroup);
            }
            l2 = c.getLong(6) / 1000L;
            obj1 = dsv.values()[c.getInt(8)];
            dsu1 = dsu.values()[c.getInt(7)];
            obj = c.getString(35);
            i = c.getInt(38);
            obj1 = g.a(((dsv) (obj1)), l.a(), dsu1, c.getString(4), c.getString(3), c.getString(34), ((String) (obj)), i, false);
            obj = g.a(l.a(), ((String) (obj)), false);
            viewgroup.a(((CharSequence) (obj1)), l2, l.a(), ((List) (obj)), i);
            viewgroup.c();
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == dsv.j || obj1 == dsv.k)
        {
            if (obj != null)
            {
                viewgroup = (OtrModificationMessageListItemView)((cbt) (obj)).b();
            } else
            {
                viewgroup = (OtrModificationMessageListItemView)viewgroup.inflate(g.gI, null);
                view.a(viewgroup);
            }
            l2 = c.getLong(6) / 1000L;
            obj1 = dsv.values()[c.getInt(8)];
            obj = dsu.values()[c.getInt(7)];
            if (obj1 == dsv.j)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            obj1 = new cgd(c.getString(4), c.getString(3));
            flag1 = l.b(((cgd) (obj1)));
            viewgroup.a(i, ((dsu) (obj)), l.e(((cgd) (obj1))), flag1);
            if (i == 2)
            {
                viewgroup.a(l2);
                if (!flag1)
                {
                    l.c(l2);
                }
            }
            viewgroup.c();
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == dsv.a || obj1 == dsv.r)
        {
            if (obj != null)
            {
                viewgroup = (bzg)((cbt) (obj)).b();
            } else
            {
                viewgroup = ((bzi)hlp.a(d, bzi)).b(d);
                view.a(viewgroup);
            }
            if (viewgroup != null)
            {
                flag1 = ((dsv) (obj1)).equals(dsv.r);
                l2 = c.getLong(6) / 1000L;
                obj = c.getString(1);
                obj1 = c.getString(5);
                viewgroup.a(l2, ((String) (obj)));
                viewgroup.a(new aqw(this, flag1, ((String) (obj1))));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (obj != null)
        {
            viewgroup = (SystemMessageListItemView)((cbt) (obj)).b();
        } else
        {
            viewgroup = (SystemMessageListItemView)viewgroup.inflate(g.gX, null);
            view.a(viewgroup);
        }
        l2 = c.getLong(6) / 1000L;
        obj = dsv.values()[c.getInt(8)];
        obj1 = dsu.values()[c.getInt(7)];
        if (obj == dsv.f || obj == dsv.p || obj == dsv.n || obj1 == dsu.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        viewgroup.a(flag1);
        viewgroup.a(g.a(((dsv) (obj)), l.a(), ((dsu) (obj1)), c.getString(4), c.getString(3), c.getString(34), c.getString(35), c.getInt(38), false));
        viewgroup.a(l2);
        aqx.a[((dsv) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 1732
    //                   1 1774
    //                   2 1781
    //                   3 1781
    //                   4 1788
    //                   5 1795;
           goto _L7 _L8 _L9 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_1795;
_L8:
        break; /* Loop/switch isn't completed */
_L7:
        i = com.google.android.apps.hangouts.R.drawable.bW;
_L14:
        viewgroup.a(i);
        viewgroup.c();
        if (true) goto _L13; else goto _L12
_L12:
        i = com.google.android.apps.hangouts.R.drawable.ci;
          goto _L14
_L9:
        i = com.google.android.apps.hangouts.R.drawable.bX;
          goto _L14
_L10:
        i = com.google.android.apps.hangouts.R.drawable.cf;
          goto _L14
        i = com.google.android.apps.hangouts.R.drawable.bR;
          goto _L14
    }

    public int getViewTypeCount()
    {
        return dsv.values().length;
    }

    static 
    {
        hnc hnc = eev.d;
        k = TimeUnit.MINUTES.toMicros(15L);
    }
}
