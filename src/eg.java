// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class eg extends ea
{

    final en f;
    Uri g;
    String h[];
    String i;
    String j[];
    String k;
    Cursor l;
    ga m;

    public eg(Context context)
    {
        super(context);
        f = new en(this);
    }

    public eg(Context context, Uri uri, String as[], String s, String as1[], String s1)
    {
        super(context);
        f = new en(this);
        g = uri;
        h = as;
        i = s;
        j = as1;
        k = s1;
    }

    public void a(Cursor cursor)
    {
        if (r())
        {
            if (cursor != null)
            {
                cursor.close();
            }
        } else
        {
            Cursor cursor1 = l;
            l = cursor;
            if (p())
            {
                super.b(cursor);
            }
            if (cursor1 != null && cursor1 != cursor && !cursor1.isClosed())
            {
                cursor1.close();
                return;
            }
        }
    }

    public void a(Uri uri)
    {
        g = uri;
    }

    public void a(Object obj)
    {
        b((Cursor)obj);
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.print("mUri=");
        printwriter.println(g);
        printwriter.print(s);
        printwriter.print("mProjection=");
        printwriter.println(Arrays.toString(h));
        printwriter.print(s);
        printwriter.print("mSelection=");
        printwriter.println(i);
        printwriter.print(s);
        printwriter.print("mSelectionArgs=");
        printwriter.println(Arrays.toString(j));
        printwriter.print(s);
        printwriter.print("mSortOrder=");
        printwriter.println(k);
        printwriter.print(s);
        printwriter.print("mCursor=");
        printwriter.println(l);
        printwriter.print(s);
        printwriter.print("mContentChanged=");
        printwriter.println(u);
    }

    public void a(String as[])
    {
        h = as;
    }

    public void b(Cursor cursor)
    {
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
    }

    public void b(Object obj)
    {
        a((Cursor)obj);
    }

    public Object d()
    {
        return h();
    }

    public void f()
    {
        super.f();
        this;
        JVM INSTR monitorenter ;
        if (m != null)
        {
            m.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Cursor h()
    {
        this;
        JVM INSTR monitorenter ;
        if (g())
        {
            throw new gb();
        }
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        m = new ga();
        this;
        JVM INSTR monitorexit ;
        Cursor cursor = ec.a(n().getContentResolver(), g, h, i, j, k, m);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        cursor.getCount();
        cursor.registerContentObserver(f);
        this;
        JVM INSTR monitorenter ;
        m = null;
        this;
        JVM INSTR monitorexit ;
        return cursor;
        RuntimeException runtimeexception;
        runtimeexception;
        cursor.close();
        throw runtimeexception;
        cursor;
        this;
        JVM INSTR monitorenter ;
        m = null;
        this;
        JVM INSTR monitorexit ;
        throw cursor;
        cursor;
        this;
        JVM INSTR monitorexit ;
        throw cursor;
        cursor;
        this;
        JVM INSTR monitorexit ;
        throw cursor;
    }

    protected void i()
    {
        if (l != null)
        {
            a(l);
        }
        if (y() || l == null)
        {
            u();
        }
    }

    protected void j()
    {
        t();
    }

    protected void k()
    {
        super.k();
        j();
        if (l != null && !l.isClosed())
        {
            l.close();
        }
        l = null;
    }

    public Uri l()
    {
        return g;
    }
}
