// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hsq extends ByteArrayOutputStream
{

    private int a;
    private final int b;
    private boolean c;
    private final Level d;
    private final Logger e;

    public hsq(Logger logger, Level level, int i)
    {
        e = (Logger)h.a(logger);
        d = (Level)h.a(level);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        b = i;
    }

    private static void a(StringBuilder stringbuilder, int i)
    {
        if (i == 1)
        {
            stringbuilder.append("1 byte");
            return;
        } else
        {
            stringbuilder.append(NumberFormat.getInstance().format(i)).append(" bytes");
            return;
        }
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            if (a != 0)
            {
                StringBuilder stringbuilder = new StringBuilder("Total: ");
                a(stringbuilder, a);
                if (count != 0 && count < a)
                {
                    stringbuilder.append(" (logging first ");
                    a(stringbuilder, count);
                    stringbuilder.append(")");
                }
                e.config(stringbuilder.toString());
                if (count != 0)
                {
                    e.log(d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            c = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        a = a + 1;
        if (count < b)
        {
            super.write(i);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        int i1;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        a = a + j;
        if (count >= b)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        i1 = count + j;
        k = j;
        if (i1 > b)
        {
            k = j + (b - i1);
        }
        super.write(abyte0, i, k);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }
}
