// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package org.chromium.net:
//            AndroidCertVerifyResult

public class X509Util
{

    private static CertificateFactory a;
    private static X509TrustManagerImplementation b;
    private static TrustStorageListener c;
    private static X509TrustManagerImplementation d;
    private static KeyStore e;
    private static KeyStore f;
    private static File g;
    private static Set h;
    private static boolean i;
    private static final Object j = new Object();
    private static boolean k = false;
    private static final char l[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    public X509Util()
    {
    }

    private static String a(X500Principal x500principal)
    {
        x500principal = MessageDigest.getInstance("MD5").digest(x500principal.getEncoded());
        char ac[] = new char[8];
        for (int i1 = 0; i1 < 4; i1++)
        {
            ac[i1 * 2] = l[x500principal[3 - i1] >> 4 & 0xf];
            ac[i1 * 2 + 1] = l[x500principal[3 - i1] & 0xf];
        }

        return new String(ac);
    }

    private static X509Certificate a(byte abyte0[])
    {
        b();
        return (X509Certificate)a.generateCertificate(new ByteArrayInputStream(abyte0));
    }

    public static AndroidCertVerifyResult a(byte abyte0[][], String s, String s1)
    {
        X509Certificate ax509certificate[];
        boolean flag;
label0:
        {
            flag = false;
            if (abyte0 == null || abyte0.length == 0 || abyte0[0] == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=")).append(Arrays.deepToString(abyte0)).toString());
            }
            int i1;
            try
            {
                b();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-1);
            }
            ax509certificate = new X509Certificate[abyte0.length];
            i1 = 0;
            do
            {
                try
                {
                    if (i1 >= abyte0.length)
                    {
                        break;
                    }
                    ax509certificate[i1] = a(abyte0[i1]);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[][])
                {
                    return new AndroidCertVerifyResult(-5);
                }
                i1++;
            } while (true);
            try
            {
                ax509certificate[0].checkValidity();
                if (b(ax509certificate[0]))
                {
                    break label0;
                }
                abyte0 = new AndroidCertVerifyResult(-6);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-3);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-4);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                return new AndroidCertVerifyResult(-1);
            }
            return abyte0;
        }
        synchronized (j)
        {
            if (b != null)
            {
                break MISSING_BLOCK_LABEL_198;
            }
            abyte0 = new AndroidCertVerifyResult(-1);
        }
        return abyte0;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0 = b.a(ax509certificate, s, s1);
_L1:
        if (abyte0.size() > 0)
        {
            flag = a((X509Certificate)abyte0.get(abyte0.size() - 1));
        }
        abyte0 = new AndroidCertVerifyResult(flag, abyte0);
        obj;
        JVM INSTR monitorexit ;
        return abyte0;
        CertificateException certificateexception;
        certificateexception;
        abyte0 = d.a(ax509certificate, s, s1);
          goto _L1
        abyte0;
        (new StringBuilder("Failed to validate the certificate chain, error: ")).append(certificateexception.getMessage());
        abyte0 = new AndroidCertVerifyResult(-2);
        obj;
        JVM INSTR monitorexit ;
        return abyte0;
    }

    private static X509TrustManagerImplementation a(KeyStore keystore)
    {
        int i1;
        int j1;
        TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustmanagerfactory.init(keystore);
        keystore = trustmanagerfactory.getTrustManagers();
        j1 = keystore.length;
        i1 = 0;
_L3:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        String s;
        s = keystore[i1];
        if (!(s instanceof X509TrustManager))
        {
            continue; /* Loop/switch isn't completed */
        }
        X509TrustManagerIceCreamSandwich x509trustmanagericecreamsandwich;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new X509TrustManagerJellyBean((X509TrustManager)s);
        }
        x509trustmanagericecreamsandwich = new X509TrustManagerIceCreamSandwich((X509TrustManager)s);
        return x509trustmanagericecreamsandwich;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        s = s.getClass().getName();
        Log.e("X509Util", (new StringBuilder("Error creating trust manager (")).append(s).append("): ").append(illegalargumentexception).toString());
        i1++;
          goto _L3
_L2:
        Log.e("X509Util", "Could not find suitable trust manager");
        return null;
    }

    static void a()
    {
        synchronized (j)
        {
            b = null;
            h = null;
            c();
        }
        nativeNotifyKeyChainChanged();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean a(X509Certificate x509certificate)
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Pair pair = new Pair(x509certificate.getSubjectX500Principal(), x509certificate.getPublicKey());
        if (h.contains(pair))
        {
            return true;
        }
        String s = a(x509certificate.getSubjectX500Principal());
        int i1 = 0;
        do
        {
            String s1 = (new StringBuilder()).append(s).append('.').append(i1).toString();
            if (!(new File(g, s1)).exists())
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj = f.getCertificate((new StringBuilder("system:")).append(s1).toString());
            if (obj != null)
            {
                if (!(obj instanceof X509Certificate))
                {
                    obj = obj.getClass().getName();
                    Log.e("X509Util", (new StringBuilder("Anchor ")).append(s1).append(" not an X509Certificate: ").append(((String) (obj))).toString());
                } else
                {
                    X509Certificate x509certificate1 = (X509Certificate)obj;
                    if (x509certificate.getSubjectX500Principal().equals(x509certificate1.getSubjectX500Principal()) && x509certificate.getPublicKey().equals(x509certificate1.getPublicKey()))
                    {
                        h.add(pair);
                        return true;
                    }
                }
            }
            i1++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void b()
    {
        synchronized (j)
        {
            c();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean b(X509Certificate x509certificate)
    {
        try
        {
            x509certificate = x509certificate.getExtendedKeyUsage();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return false;
        }
        if (x509certificate == null)
        {
            return true;
        }
        for (x509certificate = x509certificate.iterator(); x509certificate.hasNext();)
        {
            String s = (String)x509certificate.next();
            if (s.equals("1.3.6.1.5.5.7.3.1") || s.equals("2.5.29.37.0") || s.equals("2.16.840.1.113730.4.1") || s.equals("1.3.6.1.4.1.311.10.3.3"))
            {
                return true;
            }
        }

        return false;
    }

    private static void c()
    {
        if (a == null)
        {
            a = CertificateFactory.getInstance("X.509");
        }
        if (b == null)
        {
            b = a(((KeyStore) (null)));
        }
        if (i) goto _L2; else goto _L1
_L1:
        f = KeyStore.getInstance("AndroidCAStore");
        KeyStoreException keystoreexception;
        try
        {
            f.load(null);
        }
        catch (IOException ioexception1) { }
        g = new File((new StringBuilder()).append(System.getenv("ANDROID_ROOT")).append("/etc/security/cacerts").toString());
_L4:
        if (!k)
        {
            boolean flag;
            if (f != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            nativeRecordCertVerifyCapabilitiesHistogram(flag);
        }
        i = true;
_L2:
        if (h == null)
        {
            h = new HashSet();
        }
        if (e == null)
        {
            e = KeyStore.getInstance(KeyStore.getDefaultType());
            try
            {
                e.load(null);
            }
            catch (IOException ioexception) { }
        }
        if (d == null)
        {
            d = a(e);
        }
        if (!k && c == null)
        {
            c = new TrustStorageListener();
            nativeGetApplicationContext().registerReceiver(c, new IntentFilter("android.security.STORAGE_CHANGED"));
        }
        return;
        keystoreexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static native Context nativeGetApplicationContext();

    private static native void nativeNotifyKeyChainChanged();

    private static native void nativeRecordCertVerifyCapabilitiesHistogram(boolean flag);


    private class X509TrustManagerImplementation
    {

        public abstract List a(X509Certificate ax509certificate[], String s, String s1);
    }


    private class X509TrustManagerJellyBean
        implements X509TrustManagerImplementation
    {

        private final X509TrustManagerExtensions a;

        public List a(X509Certificate ax509certificate[], String s, String s1)
        {
            return a.checkServerTrusted(ax509certificate, s, s1);
        }

        public X509TrustManagerJellyBean(X509TrustManager x509trustmanager)
        {
            a = new X509TrustManagerExtensions(x509trustmanager);
        }
    }


    private class X509TrustManagerIceCreamSandwich
        implements X509TrustManagerImplementation
    {

        private final X509TrustManager a;

        public List a(X509Certificate ax509certificate[], String s, String s1)
        {
            a.checkServerTrusted(ax509certificate, s);
            return Collections.emptyList();
        }

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509trustmanager)
        {
            a = x509trustmanager;
        }
    }


    private class TrustStorageListener extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (!intent.getAction().equals("android.security.STORAGE_CHANGED"))
            {
                break MISSING_BLOCK_LABEL_15;
            }
            X509Util.a();
            return;
            context;
            Log.e("X509Util", "Unable to reload the default TrustManager", context);
            return;
            context;
            Log.e("X509Util", "Unable to reload the default TrustManager", context);
            return;
            context;
            Log.e("X509Util", "Unable to reload the default TrustManager", context);
            return;
        }

        TrustStorageListener()
        {
        }
    }

}
