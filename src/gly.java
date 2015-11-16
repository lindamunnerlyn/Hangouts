// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

public final class gly extends SecureRandomSpi
{

    private static final File a = new File("/dev/urandom");
    private static final Object b = new Object();
    private static DataInputStream c;
    private static OutputStream d;
    private boolean e;

    public gly()
    {
    }

    private static DataInputStream a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        DataInputStream datainputstream = c;
        if (datainputstream != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c = new DataInputStream(new FileInputStream(a));
        datainputstream = c;
        obj;
        JVM INSTR monitorexit ;
        return datainputstream;
        Object obj1;
        obj1;
        String s = String.valueOf(a);
        throw new SecurityException((new StringBuilder(String.valueOf(s).length() + 27)).append("Failed to open ").append(s).append(" for reading").toString(), ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private static OutputStream b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        OutputStream outputstream = d;
        if (outputstream != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        d = new FileOutputStream(a);
        outputstream = d;
        obj;
        JVM INSTR monitorexit ;
        return outputstream;
        Object obj1;
        obj1;
        String s = String.valueOf(a);
        throw new SecurityException((new StringBuilder(String.valueOf(s).length() + 27)).append("Failed to open ").append(s).append(" for writing").toString(), ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected byte[] engineGenerateSeed(int i)
    {
        byte abyte0[] = new byte[i];
        engineNextBytes(abyte0);
        return abyte0;
    }

    protected void engineNextBytes(byte abyte0[])
    {
        if (!e)
        {
            engineSetSeed(glx.b());
        }
        DataInputStream datainputstream;
        synchronized (b)
        {
            datainputstream = a();
        }
        datainputstream;
        JVM INSTR monitorenter ;
        datainputstream.readFully(abyte0);
        datainputstream;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        String s;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            s = String.valueOf(a);
        }
        throw new SecurityException((new StringBuilder(String.valueOf(s).length() + 20)).append("Failed to read from ").append(s).toString(), abyte0);
        abyte0;
        datainputstream;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    protected void engineSetSeed(byte abyte0[])
    {
        String s;
        OutputStream outputstream;
        synchronized (b)
        {
            outputstream = b();
        }
        try
        {
            outputstream.write(abyte0);
            outputstream.flush();
            e = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            s = String.valueOf(a);
        }
        break MISSING_BLOCK_LABEL_40;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        throw new SecurityException((new StringBuilder(String.valueOf(s).length() + 24)).append("Failed to mix seed into ").append(s).toString(), abyte0);
    }

}
