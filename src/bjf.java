// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class bjf extends coy
{

    final ConversationListFragment j;
    private final Context k;
    private final aoa l;
    private final ConversationListFragment m;
    private long n;
    private long o;
    private long p;

    public bjf(ConversationListFragment conversationlistfragment, Context context, aoa aoa1, ConversationListFragment conversationlistfragment1)
    {
        j = conversationlistfragment;
        super(context, null);
        n = 0x7fffffffffffffffL;
        o = 0L;
        p = 0L;
        k = context;
        l = aoa1;
        m = conversationlistfragment1;
    }

    private void b(View view, Cursor cursor)
    {
        long l1 = g.b(k, l.h());
        View view1 = ConversationListFragment.b(view);
        String s = cursor.getString(24);
        view = cursor.getString(19);
        if (view == null || s == null)
        {
            return;
        }
        String as[] = s.split("\\|");
        String as1[] = view.split("\\|");
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0x7fffffff;
        int i1 = as.length - 1;
        while (i1 >= 0) 
        {
            String s1 = as[i1];
            long l2;
            if (i1 < as1.length)
            {
                view = as1[i1];
            } else
            {
                view = "0";
            }
            l2 = Long.parseLong(view);
            if (i == 0x7fffffff && l1 >= l2)
            {
                i = stringbuilder.length();
            }
            if (TextUtils.isEmpty(s1))
            {
                continue;
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(s1);
            i1--;
        }
        view = k.getResources();
        ((TextView)view1.findViewById(h.cR)).setText(view.getString(l.fs, new Object[] {
            ConversationListFragment.b(cursor.getInt(22))
        }));
        view = new SpannableStringBuilder(stringbuilder.toString());
        view.setSpan(new StyleSpan(1), 0, Math.min(i, view.length()), 0);
        ((TextView)view1.findViewById(h.cQ)).setText(view);
        view1.setSelected(false);
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        LayoutInflater layoutinflater;
        int i1;
        layoutinflater = (LayoutInflater)context.getSystemService("layout_inflater");
        i1 = getItemViewType(cursor.getPosition());
        i1;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 54
    //                   1 239
    //                   2 247;
           goto _L1 _L2 _L3 _L4
_L1:
        return null;
_L2:
        int i = g.fv;
_L11:
        if (!ConversationListFragment.q()) goto _L6; else goto _L5
_L5:
        i1;
        JVM INSTR tableswitch 0 2: default 92
    //                   0 255
    //                   1 261
    //                   2 267;
           goto _L7 _L8 _L9 _L10
_L7:
        context = (new StringBuilder(29)).append("UNKNOWN viewType: ").append(i1).toString();
_L12:
        cursor = String.valueOf(context);
        if (i == g.fv)
        {
            context = "conversation_list_item_view";
        } else
        if (i == g.gu)
        {
            context = "invite_list_item_view";
        } else
        if (i == g.gw)
        {
            context = "invite_set_list_item_view";
        } else
        {
            context = (new StringBuilder(27)).append("UNKNOWN viewId: ").append(i).toString();
        }
        context = String.valueOf(context);
        eev.b("Babel", (new StringBuilder(String.valueOf(cursor).length() + 23 + String.valueOf(context).length())).append("newView viewType: ").append(cursor).append(" id: ").append(context).toString());
_L6:
        context = layoutinflater.inflate(i, null, false);
        if (context instanceof ConversationListItemView)
        {
            ((ConversationListItemView)context).a(ConversationListFragment.i(m));
        }
        cursor = (ConversationListItemWrapper)layoutinflater.inflate(g.fw, viewgroup, false);
        cursor.a(context);
        return cursor;
_L3:
        i = g.gu;
          goto _L11
_L4:
        i = g.gw;
          goto _L11
_L8:
        context = "VIEW_TYPE_CONVERSATION";
          goto _L12
_L9:
        context = "VIEW_TYPE_INVITATION";
          goto _L12
_L10:
        context = "VIEW_TYPE_INVITATION_SET";
          goto _L12
    }

    public void a(View view, Cursor cursor)
    {
        ((ConversationListItemWrapper)view).f();
        getItemViewType(cursor.getPosition());
        JVM INSTR tableswitch 0 2: default 44
    //                   0 103
    //                   1 335
    //                   2 326;
           goto _L1 _L2 _L3 _L4
_L1:
        eev.g("Babel", "bindView called with cursor at unknown position.");
_L6:
        view = ((ConversationListItemWrapper)view).e();
        if (view instanceof efx)
        {
            view = (efx)view;
            view.a(m.a);
            view.a(ConversationListFragment.c(cursor));
            view.a(cursor.getLong(4));
        }
        return;
_L2:
        long l1 = System.nanoTime();
        ConversationListItemView conversationlistitemview;
        long l2;
        boolean flag;
        if (cursor.getInt(14) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b("Expected condition to be false", flag);
        conversationlistitemview = (ConversationListItemView)ConversationListFragment.b(view);
        if (ConversationListFragment.j(m) == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        conversationlistitemview.a(cursor, l, flag, null);
        l2 = cursor.getLong(4);
        if (n > l2)
        {
            n = l2;
        }
        conversationlistitemview.setSelected(false);
        l2 = System.nanoTime();
        if (ConversationListFragment.q())
        {
            l1 = (l2 - l1) / 1000L;
            o = o + l1;
            p = p + 1L;
            l2 = o / p;
            long l3 = p;
            eev.f("Babel", (new StringBuilder(88)).append("BIND: CURRENT: ").append(l1).append(" AVERAGE: ").append(l2).append(" (").append(l3).append(")").toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b(view, cursor);
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem invitelistitem = (com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem)ConversationListFragment.b(view);
        String s = ConversationListFragment.c(cursor);
        Object obj2;
        TextView textview;
        TextView textview1;
        int i;
        if (cursor.getInt(3) == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        textview = (TextView)invitelistitem.findViewById(h.cV);
        textview1 = (TextView)invitelistitem.findViewById(h.cS);
        obj2 = j.getResources();
        if (i != 0)
        {
            i = cursor.getString(7).split(", ").length - 1;
            Object obj = cursor.getString(6);
            Object obj1 = cursor.getString(18);
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                if (TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    obj1 = ((Resources) (obj2)).getString(l.eS);
                    obj = ((Resources) (obj2)).getQuantityString(g.hB, i + 1, new Object[] {
                        Integer.valueOf(i + 1)
                    });
                } else
                if (i == 0)
                {
                    obj = ((Resources) (obj2)).getString(l.fa);
                } else
                {
                    obj = ((Resources) (obj2)).getQuantityString(g.hD, i, new Object[] {
                        Integer.valueOf(i)
                    });
                }
            } else
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj2 = ((Resources) (obj2)).getQuantityString(g.hB, i + 1, new Object[] {
                    Integer.valueOf(i + 1)
                });
                obj1 = obj;
                obj = obj2;
            } else
            if (i == 0)
            {
                obj2 = ((Resources) (obj2)).getString(l.eZ, new Object[] {
                    obj1
                });
                obj1 = obj;
                obj = obj2;
            } else
            {
                obj2 = ((Resources) (obj2)).getQuantityString(g.hC, i, new Object[] {
                    Integer.valueOf(i), obj1
                });
                obj1 = obj;
                obj = obj2;
            }
            textview.setText(((CharSequence) (obj1)));
            textview1.setText(((CharSequence) (obj)));
        } else
        {
            textview.setText(((Resources) (obj2)).getString(l.eT));
            textview1.setText(cursor.getString(18));
        }
        invitelistitem.a(l, s);
        invitelistitem.setSelected(false);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void c()
    {
        if (n != 0x7fffffffffffffffL)
        {
            RealTimeChatService.a(l, n);
        }
    }

    public void d()
    {
        n = 0x7fffffffffffffffL;
    }

    public int getItemViewType(int i)
    {
        byte byte0 = 2;
        Cursor cursor = a();
        cursor.moveToPosition(i);
        if (ConversationListFragment.q())
        {
            int i1 = cursor.getInt(14);
            ConversationListFragment.d((new StringBuilder(48)).append("getItemViewType position ").append(i).append(" ").append(i1).toString());
        }
        if (cursor.getInt(14) == 2)
        {
            i = 0;
        } else
        {
            i = byte0;
            if (cursor.getInt(22) <= 1)
            {
                return 1;
            }
        }
        return i;
    }

    public int getViewTypeCount()
    {
        return 3;
    }
}
