// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class bim extends coy
{

    final ConversationInviteListFragment j;
    private final Context k;
    private final aoa l;
    private final ConversationInviteListFragment m;
    private long n;

    public bim(ConversationInviteListFragment conversationinvitelistfragment, Context context, aoa aoa, ConversationInviteListFragment conversationinvitelistfragment1)
    {
        j = conversationinvitelistfragment;
        super(context, null);
        n = 0x7fffffffffffffffL;
        k = context;
        l = aoa;
        m = conversationinvitelistfragment1;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        cursor = (LayoutInflater)context.getSystemService("layout_inflater");
        int i = g.gt;
        if (ConversationInviteListFragment.c())
        {
            eev.b("Babel", "newView viewType: VIEW_TYPE_INVITATION id: invite_item_view");
        }
        context = cursor.inflate(i, null, false);
        cursor = (ConversationListItemWrapper)cursor.inflate(g.fw, viewgroup, false);
        cursor.a(context);
        return cursor;
    }

    public void a(View view, Cursor cursor)
    {
        Object obj1;
        TextView textview;
        TextView textview1;
        int i;
        ((ConversationListItemWrapper)view).f();
        com.google.android.apps.hangouts.fragments.ConversationInviteListFragment.InviteItem inviteitem = (com.google.android.apps.hangouts.fragments.ConversationInviteListFragment.InviteItem)ConversationInviteListFragment.b(view);
        String s = ConversationInviteListFragment.a(cursor);
        if (cursor.getInt(3) == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        textview = (TextView)inviteitem.findViewById(h.cV);
        textview1 = (TextView)inviteitem.findViewById(h.cS);
        obj1 = j.getResources();
        if (i == 0) goto _L2; else goto _L1
_L1:
        i = cursor.getString(7).split(", ").length - 1;
        view = cursor.getString(6);
        Object obj = cursor.getString(18);
        if (TextUtils.isEmpty(view))
        {
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = ((Resources) (obj1)).getString(l.eS);
                view = ((Resources) (obj1)).getQuantityString(g.hB, i + 1, new Object[] {
                    Integer.valueOf(i + 1)
                });
            } else
            if (i == 0)
            {
                view = ((Resources) (obj1)).getString(l.fa);
            } else
            {
                view = ((Resources) (obj1)).getQuantityString(g.hD, i, new Object[] {
                    Integer.valueOf(i)
                });
            }
        } else
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = ((Resources) (obj1)).getQuantityString(g.hB, i + 1, new Object[] {
                Integer.valueOf(i + 1)
            });
            obj = view;
            view = ((View) (obj1));
        } else
        if (i == 0)
        {
            obj1 = ((Resources) (obj1)).getString(l.eZ, new Object[] {
                obj
            });
            obj = view;
            view = ((View) (obj1));
        } else
        {
            obj1 = ((Resources) (obj1)).getQuantityString(g.hC, i, new Object[] {
                Integer.valueOf(i), obj
            });
            obj = view;
            view = ((View) (obj1));
        }
        textview.setText(((CharSequence) (obj)));
        textview1.setText(view);
_L4:
        inviteitem.a(cursor.getString(20), l);
        inviteitem.a(l, s);
        inviteitem.setSelected(false);
        return;
_L2:
        textview.setText(cursor.getString(18));
        switch (cursor.getInt(8))
        {
        case 2: // '\002'
        default:
            textview1.setText(l.eW);
            break;

        case 3: // '\003'
            textview1.setText(l.eX);
            break;

        case 1: // '\001'
            textview1.setText(l.eY);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
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

    public int getViewTypeCount()
    {
        return 3;
    }
}
