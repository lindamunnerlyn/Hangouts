// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ffz
{

    SharedPreferences a;
    Context b;

    public ffz(Context context)
    {
        this(context, "com.google.android.gms.gcm.appid");
    }

    private ffz(Context context, String s)
    {
        b = context;
        a = context.getSharedPreferences(s, 4);
        s = (new StringBuilder()).append(s).append("-no-backup").toString();
        new ef();
        context = b;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            context = context.getNoBackupFilesDir();
        } else
        {
            context = ef.a(new File(context.getApplicationInfo().dataDir, "no_backup"));
        }
        context = new File(context, s);
        if (context.exists())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (context.createNewFile() && !a())
        {
            ffs.a(b, this);
        }
_L1:
        return;
        context;
        if (Log.isLoggable("InstanceID/Store", 3))
        {
            (new StringBuilder("Error creating file in no backup dir: ")).append(context.getMessage());
            return;
        }
          goto _L1
    }

    private String a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.getString((new StringBuilder()).append(s).append("|S|").append(s1).toString(), null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private void a(android.content.SharedPreferences.Editor editor, String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        editor.putString((new StringBuilder()).append(s).append("|S|").append(s1).toString(), s2);
        this;
        JVM INSTR monitorexit ;
        return;
        editor;
        throw editor;
    }

    private static String b(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append("|T|").append(s1).append("|").append(s2).toString();
    }

    private void e(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        editor = a.edit();
        Iterator iterator = a.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.startsWith(s))
            {
                editor.remove(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_78;
        s;
        throw s;
        editor.commit();
        this;
        JVM INSTR monitorexit ;
    }

    private KeyPair f(String s)
    {
        String s1;
        Object obj;
        s1 = a(s, "|P|");
        obj = a(s, "|K|");
        if (obj == null)
        {
            return null;
        }
        s = Base64.decode(s1, 8);
        byte abyte0[] = Base64.decode(((String) (obj)), 8);
        obj = KeyFactory.getInstance("RSA");
        s = new KeyPair(((KeyFactory) (obj)).generatePublic(new X509EncodedKeySpec(s)), ((KeyFactory) (obj)).generatePrivate(new PKCS8EncodedKeySpec(abyte0)));
        return s;
        s;
_L2:
        (new StringBuilder("Invalid key stored ")).append(s);
        ffs.a(b, this);
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public String a(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        s = b(s, s1, s2);
        s = a.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    KeyPair a(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        KeyPair keypair;
        keypair = g.n();
        android.content.SharedPreferences.Editor editor = a.edit();
        a(editor, s, "|P|", ffr.a(keypair.getPublic().getEncoded()));
        a(editor, s, "|K|", ffr.a(keypair.getPrivate().getEncoded()));
        a(editor, s, "cre", Long.toString(l));
        editor.commit();
        this;
        JVM INSTR monitorexit ;
        return keypair;
        s;
        throw s;
    }

    public void a(String s, String s1, String s2, String s3, String s4)
    {
        this;
        JVM INSTR monitorenter ;
        s = b(s, s1, s2);
        s1 = a.edit();
        s1.putString(s, s3);
        s1.putString("appVersion", s4);
        s1.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000L));
        s1.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    boolean a()
    {
        return a.getAll().isEmpty();
    }

    public KeyPair b(String s)
    {
        return f(s);
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.edit().clear().commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void c(String s)
    {
        e((new StringBuilder()).append(s).append("|").toString());
    }

    public void d(String s)
    {
        e((new StringBuilder()).append(s).append("|T|").toString());
    }
}
