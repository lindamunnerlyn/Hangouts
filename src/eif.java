// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class eif
{

    public Queue a;
    public Set b;
    public Long c;
    public boolean d;
    public final boolean e;
    public long f;
    public boolean g;

    public eif(boolean flag)
    {
        e = flag;
        c();
    }

    private void c()
    {
        a = new LinkedList();
        b = new HashSet();
        c = null;
        d = true;
        f = 0L;
        g = false;
    }

    private Long d()
    {
        return (Long)a.poll();
    }

    public void a()
    {
        a = new LinkedList();
        b = new HashSet();
        d = true;
        g = false;
    }

    public void a(long l)
    {
        f = Math.max(f, l);
    }

    public void a(Cursor cursor)
    {
        if (aqu.j)
        {
            Object obj;
            int i;
            int j;
            long l;
            long l1;
            if (cursor == null)
            {
                obj = "null";
            } else
            {
                obj = Integer.valueOf(cursor.getCount());
            }
            obj = String.valueOf(obj);
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 32)).append("[MessageListState] setNewCursor ").append(((String) (obj))).toString());
        }
        this;
        JVM INSTR monitorenter ;
        obj = new LinkedList();
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        if (cursor.moveToLast())
        {
            i = cursor.getColumnIndexOrThrow("_id");
            j = cursor.getColumnIndexOrThrow("timestamp");
            if (!d && !e && !g)
            {
                do
                {
                    l = cursor.getLong(j);
                    l1 = cursor.getLong(i);
                    if (b.contains(Long.valueOf(l1)) || l <= f)
                    {
                        break;
                    }
                    ((List) (obj)).add(0, Long.valueOf(l1));
                } while (cursor.moveToPrevious());
            }
            cursor.moveToLast();
            a(cursor.getLong(j));
            if (d || e || g)
            {
                c = Long.valueOf(cursor.getLong(i));
            }
        }
        a.addAll(((java.util.Collection) (obj)));
        b.addAll(((java.util.Collection) (obj)));
        if (aqu.j)
        {
            cursor = String.valueOf(a);
            eev.b("Babel", (new StringBuilder(String.valueOf(cursor).length() + 26)).append("[MessageListState] newIds ").append(cursor).toString());
        }
        d = false;
        this;
        JVM INSTR monitorexit ;
        return;
        cursor;
        this;
        JVM INSTR monitorexit ;
        throw cursor;
    }

    public void a(MessageListItemWrapperView messagelistitemwrapperview)
    {
        Long long1 = b();
        if (long1 != null && messagelistitemwrapperview.e() == g.a(long1, 0L))
        {
            c = d();
            return;
        } else
        {
            eev.f("Babel", "[MessageCursorAdapter] onRevealFinished called when the new message queue was empty.");
            return;
        }
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public Long b()
    {
        return (Long)a.peek();
    }

    public boolean b(long l)
    {
        return a.contains(Long.valueOf(l));
    }

    public boolean c(long l)
    {
        return c != null && g.a(c, 0L) == l;
    }
}
