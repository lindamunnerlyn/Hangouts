// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class bax
{

    gz a;
    private final int b;

    bax(int i)
    {
        a = new gz();
        b = i;
    }

    private void a(String s, long l)
    {
        int i = 0;
        while (i < a.size()) 
        {
            String s2 = (String)a.b(i);
            if (((Set)a.c(i)).remove(s))
            {
                String s1 = String.valueOf(s);
                if (s1.length() != 0)
                {
                    s1 = "MessageList data changed, remove unrendered message ID: ".concat(s1);
                } else
                {
                    s1 = new String("MessageList data changed, remove unrendered message ID: ");
                }
                eev.e("UnrenderedMsg", s1);
                h.a(b, l, 10, (new cab()).a(s2).b(s).a(208));
            }
            i++;
        }
    }

    void a()
    {
        String s = String.valueOf(a);
        eev.e("UnrenderedMsg", (new StringBuilder(String.valueOf(s).length() + 54)).append("Leaving conversation, unrendered message list logged: ").append(s).toString());
        long l = SystemClock.elapsedRealtime();
        for (int i = 0; i < a.size(); i++)
        {
            String s1 = (String)a.b(i);
            CharSequence charsequence;
            for (Iterator iterator = ((Set)a.c(i)).iterator(); iterator.hasNext(); h.a(b, l, 10, (new cab()).a(s1).b(charsequence.toString()).a(209)))
            {
                charsequence = (CharSequence)iterator.next();
            }

        }

        a.clear();
    }

    void a(Cursor cursor)
    {
        boolean flag = false;
        int k = cursor.getPosition();
        long l1 = SystemClock.elapsedRealtime();
        int l = Math.min(10, cursor.getCount());
        cursor.moveToLast();
        for (int i = 0; !cursor.isBeforeFirst() && i < l; i++)
        {
            a(cursor.getString(1), l1);
            cursor.moveToPrevious();
        }

        cursor.moveToFirst();
        for (int j = ((flag) ? 1 : 0); !cursor.isAfterLast() && j < l; j++)
        {
            a(cursor.getString(1), l1);
            cursor.moveToNext();
        }

        cursor.moveToPosition(k);
    }

    void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        CharSequence acharsequence[] = bundle.getCharSequenceArray("unrendered_message_list_conv_ids");
        if (acharsequence != null)
        {
            int i = 0;
            while (i < acharsequence.length) 
            {
                String s = acharsequence[i].toString();
                Object obj = String.valueOf("unrendered_message_list");
                String s1 = String.valueOf(s);
                if (s1.length() != 0)
                {
                    obj = ((String) (obj)).concat(s1);
                } else
                {
                    obj = new String(((String) (obj)));
                }
                obj = bundle.getCharSequenceArray(((String) (obj)));
                if (obj != null && obj.length > 0)
                {
                    a.put(s, new HashSet(Arrays.asList(((Object []) (obj)))));
                }
                i++;
            }
        }
        bundle = String.valueOf(a);
        eev.e("UnrenderedMsg", (new StringBuilder(String.valueOf(bundle).length() + 40)).append("Saved unrendered message list restored: ").append(bundle).toString());
    }

    void a(String s, String s1)
    {
        if (!a.containsKey(s))
        {
            a.put(s, new HashSet());
        }
        ((Set)a.get(s)).add(s1);
        eev.e("UnrenderedMsg", (new StringBuilder(String.valueOf(s1).length() + 59 + String.valueOf(s).length())).append("Message sent, add unrendered message ID: ").append(s1).append(" to conversation: ").append(s).toString());
    }

    void b(Bundle bundle)
    {
        if (!a.isEmpty())
        {
            String s = String.valueOf(a);
            eev.e("UnrenderedMsg", (new StringBuilder(String.valueOf(s).length() + 31)).append("Unrendered message list saved: ").append(s).toString());
            int j = a.size();
            bundle.putCharSequenceArray("unrendered_message_list_conv_ids", (CharSequence[])a.keySet().toArray(new CharSequence[j]));
            int i = 0;
            while (i < j) 
            {
                String s2 = (String)a.b(i);
                Set set = (Set)a.c(i);
                String s1 = String.valueOf("unrendered_message_list");
                s2 = String.valueOf(s2);
                if (s2.length() != 0)
                {
                    s1 = s1.concat(s2);
                } else
                {
                    s1 = new String(s1);
                }
                bundle.putCharSequenceArray(s1, (CharSequence[])set.toArray(new CharSequence[set.size()]));
                i++;
            }
        }
    }
}
