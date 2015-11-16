// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.hangouts.views.HangoutEventMessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class avu
{

    private static final jsh a = jsh.a(dsw);
    private final Context b;
    private final ListView c;

    public avu(Context context, ListView listview)
    {
        b = context;
        c = listview;
    }

    private static Set a(URLSpan aurlspan[])
    {
        HashSet hashset = new HashSet();
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            hashset.add(aurlspan[i].getURL());
        }

        return hashset;
    }

    static void a(Context context)
    {
        for (jyh jyh = a.a(); jyh.hasNext(); hlp.b(context, (Class)jyh.next())) { }
    }

    public void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo, MenuInflater menuinflater, dsx dsx)
    {
label0:
        {
            if (view == c)
            {
                if (!(contextmenuinfo instanceof android.widget.AdapterView.AdapterContextMenuInfo))
                {
                    break MISSING_BLOCK_LABEL_537;
                }
                view = (MessageListItemWrapperView)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView;
                if (view == null)
                {
                    break MISSING_BLOCK_LABEL_537;
                }
                if (!(view.c() instanceof HangoutEventMessageListItemView))
                {
                    break label0;
                }
            }
            return;
        }
        if (!(view.c() instanceof MessageListItemView))
        {
            break MISSING_BLOCK_LABEL_537;
        }
        view = (MessageListItemView)view.c();
        view.p();
        JVM INSTR tableswitch 0 1: default 84
    //                   0 481
    //                   1 481;
           goto _L1 _L2 _L2
_L1:
        int i = 0;
_L4:
        boolean flag;
        boolean flag1;
        int j;
        if (view.q() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = view.o();
        flag1 = flag;
        flag = i;
        i = j;
          goto _L3
_L2:
        i = 1;
          goto _L4
_L3:
        menuinflater.inflate(g.hq, contextmenu);
        if (dsx != null)
        {
            contextmenu.add(0, 1000, 0, l.fI);
        }
        if (!flag)
        {
            if (!flag1 || i > 0)
            {
                contextmenu.findItem(h.bD).setVisible(false);
            }
            contextmenu.findItem(h.aI).setVisible(false);
        }
        if (contextmenuinfo instanceof android.widget.AdapterView.AdapterContextMenuInfo)
        {
            view = (MessageListItemWrapperView)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView;
            if (view != null && (view.c() instanceof MessageListItemView))
            {
                view = (MessageListItemView)view.c();
                if (TextUtils.isEmpty(view.e()))
                {
                    contextmenu.findItem(h.az).setVisible(false);
                }
                if (view.v())
                {
                    contextmenuinfo = contextmenu.findItem(1000);
                    if (contextmenuinfo != null)
                    {
                        contextmenuinfo.setVisible(false);
                    }
                }
                if (!view.n())
                {
                    contextmenu.findItem(h.fk).setVisible(false);
                }
                view = view.e();
                if (!TextUtils.isEmpty(view))
                {
                    view = new SpannableString(view);
                    Linkify.addLinks(view, 15);
                    menuinflater = a((URLSpan[])view.getSpans(0, view.length(), android/text/style/URLSpan)).iterator();
                    do
                    {
                        if (!menuinflater.hasNext())
                        {
                            break;
                        }
                        view = (String)menuinflater.next();
                        i = view.indexOf(':');
                        if (i >= 0)
                        {
                            contextmenuinfo = view.substring(0, i);
                            view = view.substring(i + 1);
                        } else
                        {
                            contextmenuinfo = null;
                        }
                        if ("mailto".equalsIgnoreCase(contextmenuinfo))
                        {
                            i = 1;
                            contextmenuinfo = view;
                        } else
                        if ("tel".equalsIgnoreCase(contextmenuinfo))
                        {
                            contextmenuinfo = eey.p(view);
                            i = 1;
                        } else
                        {
                            i = 0;
                            contextmenuinfo = view;
                        }
                        if (i != 0)
                        {
                            view = g.r(view);
                            contextmenu.add(0, 27, 0, b.getString(l.fj, new Object[] {
                                contextmenuinfo
                            })).setIntent(view).setVisible(true);
                        }
                    } while (true);
                }
            }
        }
        contextmenu.setHeaderTitle(l.fo);
        return;
        i = 0;
        flag1 = false;
        flag = false;
        if (true) goto _L3; else goto _L5
_L5:
    }

}
