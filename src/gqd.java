// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;

public final class gqd
{

    private static final byte a[] = d();

    public static void a()
    {
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L2; else goto _L1
_L1:
        int i = android.os.Build.VERSION.SDK_INT;
        if (i <= 18) goto _L3; else goto _L2
_L2:
        if (android.os.Build.VERSION.SDK_INT > 18) goto _L5; else goto _L4
_L4:
        java.security.Provider aprovider[] = Security.getProviders("SecureRandom.SHA1PRNG");
        if (aprovider == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (aprovider.length > 0 && gqf.equals(aprovider[0].getClass()))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        Security.insertProviderAt(new gqf(), 1);
        Object obj = new SecureRandom();
        if (!gqf.equals(((SecureRandom) (obj)).getProvider().getClass()))
        {
            obj = String.valueOf(((SecureRandom) (obj)).getProvider().getClass());
            throw new SecurityException((new StringBuilder(String.valueOf(obj).length() + 45)).append("new SecureRandom() backed by wrong Provider: ").append(((String) (obj))).toString());
        }
          goto _L6
        Object obj1;
        obj1;
_L5:
        return;
_L3:
        Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", new Class[] {
            [B
        }).invoke(null, new Object[] {
            c()
        });
        i = ((Integer)Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", new Class[] {
            java/lang/String, Long.TYPE
        }).invoke(null, new Object[] {
            "/dev/urandom", Integer.valueOf(1024)
        })).intValue();
        if (i == 1024) goto _L2; else goto _L7
_L7:
        throw new IOException((new StringBuilder(60)).append("Unexpected number of bytes read from Linux PRNG: ").append(i).toString());
        obj1;
        try
        {
            throw new SecurityException("Failed to seed OpenSSL PRNG", ((Throwable) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
          goto _L2
_L6:
        Object obj2 = SecureRandom.getInstance("SHA1PRNG");
        if (!gqf.equals(((SecureRandom) (obj2)).getProvider().getClass()))
        {
            String s = String.valueOf("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ");
            obj2 = String.valueOf(((SecureRandom) (obj2)).getProvider().getClass());
            throw new SecurityException((new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(obj2).length())).append(s).append(((String) (obj2))).toString());
        }
          goto _L5
        s;
        throw new SecurityException("SHA1PRNG not available", s);
          goto _L2
    }

    static byte[] b()
    {
        return c();
    }

    private static byte[] c()
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeLong(System.currentTimeMillis());
            dataoutputstream.writeLong(System.nanoTime());
            dataoutputstream.writeInt(Process.myPid());
            dataoutputstream.writeInt(Process.myUid());
            dataoutputstream.write(a);
            dataoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            throw new SecurityException("Failed to generate seed", ioexception);
        }
        return abyte0;
    }

    private static byte[] d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = Build.FINGERPRINT;
        if (s != null)
        {
            stringbuilder.append(s);
        }
        s = Build.SERIAL;
        if (s != null)
        {
            stringbuilder.append(s);
        }
        byte abyte0[];
        try
        {
            abyte0 = stringbuilder.toString().getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
        return abyte0;
    }

}
