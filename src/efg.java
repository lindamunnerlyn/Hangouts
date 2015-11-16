// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class efg extends gbk
{

    final String a;
    final String b;
    final MessageListItemView c;
    private String e;

    public efg(MessageListItemView messagelistitemview, String s, String s1)
    {
        c = messagelistitemview;
        a = s;
        b = s1;
        super();
        e = MessageListItemView.c(c).O();
    }

    protected Object a()
    {
        if (a != null)
        {
            String s = String.valueOf(a);
            if (s.length() != 0)
            {
                return "g:".concat(s);
            } else
            {
                return new String("g:");
            }
        }
        if (b != null)
        {
            String s1 = String.valueOf(b);
            if (s1.length() != 0)
            {
                return "p:".concat(s1);
            } else
            {
                return new String("p:");
            }
        } else
        {
            return null;
        }
    }

    protected void onPostExecute(Object obj)
    {
        dqd dqd1;
label0:
        {
            obj = (String)obj;
            dqd1 = (dqd)hgx.b(c.getContext(), dqd);
            if (dqd1 != null)
            {
                if (MessageListItemView.c(c).u() && g.b(MessageListItemView.c(c).O(), e))
                {
                    break label0;
                }
                ebw.e("Babel", "Don't show SmartProfile; user switched conversations/fragments.");
            }
            return;
        }
        if (obj != null)
        {
            ebw.e("Babel", String.format("Maybe starting SmartProfile from conversation with personId %s", new Object[] {
                obj
            }));
            dqd1.a(MessageListItemView.c(c).getActivity(), MessageListItemView.c(c), ((String) (obj)), MessageListItemView.d(c), MessageListItemView.e(c).c());
            g.a(MessageListItemView.f(c), 2141);
            return;
        } else
        {
            ebw.f("Babel", "Couldn't show SmartProfile from conversation; personId was null");
            Toast.makeText(c.getContext(), l.gU, 0).show();
            return;
        }
    }
}
