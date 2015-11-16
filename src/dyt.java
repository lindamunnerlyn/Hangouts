// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.telecom.ConnectionRequest;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Iterator;
import java.util.Locale;

public final class dyt
{

    private final TeleConnectionService a;
    private final ConnectionRequest b;
    private final boolean c;
    private dyq d;
    private String e;
    private int f;
    private boolean g;

    public dyt(TeleConnectionService teleconnectionservice, ConnectionRequest connectionrequest, dyq dyq1, boolean flag)
    {
        a = teleconnectionservice;
        b = connectionrequest;
        d = dyq1;
        c = flag;
    }

    private static boolean a(char c1)
    {
        return c1 >= '2' && c1 <= '9';
    }

    private static boolean a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if (TextUtils.isEmpty(s))
            {
                return false;
            }
            int i1;
            boolean flag;
            if (s1.charAt(0) != '!')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            for (; i1 < s1.length(); i1 += 2)
            {
                if (s1.charAt(i1) == s.charAt(0) && s1.charAt(i1 + 1) == s.charAt(1))
                {
                    return flag;
                }
            }

            if (flag)
            {
                return false;
            }
        }
        return true;
    }

    private boolean a(boolean flag)
    {
        if (flag && !g.a(a, "babel_telephony_allow_proxy_number_routing", true))
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, disabled by gservices.");
            return false;
        }
        if (g.a(a, "babel_telephony_force_proxy_number_fetch", false))
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, forcing proxy number fetch.");
            return true;
        }
        if (f != 1)
        {
            return false;
        }
        if (c)
        {
            return false;
        }
        if (d.e() == 2)
        {
            return false;
        }
        if (d.a() == 1)
        {
            return false;
        }
        if (m())
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, GoogleVoice request");
            return false;
        }
        if (eaj.a(a).e() == -1)
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, no Tycho account.");
            return false;
        }
        if (eey.j(c()))
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, emergency number");
            return false;
        }
        if (PhoneNumberUtils.formatNumberToE164(c(), eey.k()) == null)
        {
            String s = String.valueOf(g.u(c()));
            if (s.length() != 0)
            {
                s = "TelePhoneNumber.shouldUseProxyNumber, can't convert to e164 format, ".concat(s);
            } else
            {
                s = new String("TelePhoneNumber.shouldUseProxyNumber, can't convert to e164 format, ");
            }
            eev.e("Babel_telephony", s);
            return false;
        }
        if (d.e() == 3)
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, can't tell if we're international.");
            return false;
        }
        if (d.a() == 3)
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, can't tell if we're roaming.");
            return false;
        } else
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldUseProxyNumber, true");
            return true;
        }
    }

    private String b(String s)
    {
label0:
        {
            String s2 = g.a(a, "babel_telephony_remapped_phone_numbers", dxt.c);
            Object obj = s;
            if (TextUtils.isEmpty(s2))
            {
                break label0;
            }
            String s1;
            String s4;
            android.text.TextUtils.SimpleStringSplitter simplestringsplitter;
            android.text.TextUtils.SimpleStringSplitter simplestringsplitter1;
            Iterator iterator;
            if (s.startsWith("*"))
            {
                s1 = s.substring(1);
            } else
            {
                s1 = s;
            }
            s4 = d.d();
            obj = new android.text.TextUtils.SimpleStringSplitter(',');
            simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter('=');
            simplestringsplitter1 = new android.text.TextUtils.SimpleStringSplitter('/');
            ((android.text.TextUtils.SimpleStringSplitter) (obj)).setString(s2);
            iterator = ((android.text.TextUtils.SimpleStringSplitter) (obj)).iterator();
            do
            {
                String s3;
                do
                {
                    do
                    {
                        obj = s;
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        simplestringsplitter.setString((String)iterator.next());
                        if (simplestringsplitter.hasNext())
                        {
                            obj = simplestringsplitter.next();
                        } else
                        {
                            obj = null;
                        }
                    } while (!s1.equals(obj));
                    if (simplestringsplitter.hasNext())
                    {
                        obj = simplestringsplitter.next();
                    } else
                    {
                        obj = null;
                    }
                } while (TextUtils.isEmpty(((CharSequence) (obj))));
                simplestringsplitter1.setString(((String) (obj)));
                if (simplestringsplitter1.hasNext())
                {
                    obj = simplestringsplitter1.next();
                } else
                {
                    obj = null;
                }
                if (simplestringsplitter1.hasNext())
                {
                    s3 = simplestringsplitter1.next();
                } else
                {
                    s3 = null;
                }
            } while (!a(s4, s3));
            s = String.valueOf(g.u(s));
            s1 = String.valueOf(g.u(((String) (obj))));
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 54 + String.valueOf(s1).length())).append("TelePhoneNumber.maybeRemapPhoneNumber, remapped: ").append(s).append(" to: ").append(s1).toString());
            g = true;
        }
        return ((String) (obj));
    }

    private static boolean c(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (s.length() != 10 || !a(s.charAt(0)) || !a(s.charAt(3))) goto _L2; else goto _L1
_L1:
        int i1 = 1;
_L5:
        if (i1 >= 10)
        {
            break; /* Loop/switch isn't completed */
        }
        if (PhoneNumberUtils.isISODigit(s.charAt(i1))) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        return true;
        eev.f("Babel_telephony", "TeleUtils.isNorthAmericanNumberFormat, got null dialStr");
        return false;
    }

    int a()
    {
        return f;
    }

    void a(int i1)
    {
        f = i1;
    }

    void a(dyq dyq1)
    {
        d = dyq1;
    }

    void a(String s)
    {
        e = s;
    }

    boolean a(Uri uri)
    {
        if (e == null && uri == null)
        {
            return true;
        }
        if (!TextUtils.isEmpty(e) && uri != null && "tel".equals(uri.getScheme()))
        {
            return g.d(e, uri.getSchemeSpecificPart());
        } else
        {
            return false;
        }
    }

    dyq b()
    {
        return d;
    }

    public String c()
    {
        Uri uri;
        Uri uri1;
        boolean flag;
        if (f != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (!k() && f == 2 && m())
        {
            uri = (Uri)b.getExtras().getParcelable("android.telecom.extra.GATEWAY_ORIGINAL_ADDRESS");
        } else
        {
            uri = null;
        }
        uri1 = uri;
        if (uri == null)
        {
            uri1 = b.getAddress();
        }
        if (uri1 != null && "tel".equals(uri1.getScheme()))
        {
            return uri1.getSchemeSpecificPart();
        } else
        {
            return null;
        }
    }

    public String d()
    {
        String s = c();
        if (s != null)
        {
            return eey.g(s);
        } else
        {
            return null;
        }
    }

    String e()
    {
        String s;
        boolean flag;
        flag = true;
        s = c();
        if (f != 2) goto _L2; else goto _L1
_L1:
        Object obj = b.getAddress();
        if (obj == null || !"voicemail".equals(((Uri) (obj)).getScheme())) goto _L2; else goto _L3
_L3:
        obj = ((TelephonyManager)a.getSystemService("phone")).getVoiceMailNumber();
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L4
_L4:
        s = String.valueOf(g.u(((String) (obj))));
        if (s.length() != 0)
        {
            s = "TelePhoneNumber.maybeFixVoicemailUri, changing voicemail URI to number: ".concat(s);
        } else
        {
            s = new String("TelePhoneNumber.maybeFixVoicemailUri, changing voicemail URI to number: ");
        }
        eev.e("Babel_telephony", s);
_L6:
        if (obj == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = s;
        if (true) goto _L6; else goto _L5
_L5:
label0:
        {
label1:
            {
label2:
                {
                    {
                        if (e != null)
                        {
                            obj = e;
                        }
                        String s1 = ((String) (obj));
                        if (f == 2)
                        {
                            s1 = PhoneNumberUtils.extractNetworkPortion(((String) (obj)));
                        }
                        obj = s1;
                        if (k())
                        {
                            break label1;
                        }
                        String s2 = s1;
                        if (f != 2)
                        {
                            break label2;
                        }
                        s2 = s1;
                        if (s1.length() != 7)
                        {
                            break label2;
                        }
                        obj = eey.h();
                        if (obj == null || ((String) (obj)).length() < 10)
                        {
                            break label0;
                        }
                        int i1;
                        int j1;
                        if (((String) (obj)).charAt(0) == '+')
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        j1 = i1;
                        if (((String) (obj)).charAt(i1) == '1')
                        {
                            j1 = i1 + 1;
                        }
                        if (j1 != 0)
                        {
                            obj = ((String) (obj)).substring(j1);
                        }
                        if (!c(((String) (obj))))
                        {
                            break label0;
                        }
                        s2 = eey.j();
                        i1 = ((flag) ? 1 : 0);
                        if (!"US".equals(s2))
                        {
                            i1 = ((flag) ? 1 : 0);
                            if (!"CA".equals(s2))
                            {
                                i1 = ((flag) ? 1 : 0);
                                if (!"DO".equals(s2))
                                {
                                    i1 = ((flag) ? 1 : 0);
                                    if (!"AG".equals(s2))
                                    {
                                        i1 = ((flag) ? 1 : 0);
                                        if (!"AI".equals(s2))
                                        {
                                            i1 = ((flag) ? 1 : 0);
                                            if (!"AS".equals(s2))
                                            {
                                                i1 = ((flag) ? 1 : 0);
                                                if (!"BB".equals(s2))
                                                {
                                                    i1 = ((flag) ? 1 : 0);
                                                    if (!"BM".equals(s2))
                                                    {
                                                        i1 = ((flag) ? 1 : 0);
                                                        if (!"BS".equals(s2))
                                                        {
                                                            i1 = ((flag) ? 1 : 0);
                                                            if (!"DM".equals(s2))
                                                            {
                                                                i1 = ((flag) ? 1 : 0);
                                                                if (!"DM".equals(s2))
                                                                {
                                                                    i1 = ((flag) ? 1 : 0);
                                                                    if (!"GD".equals(s2))
                                                                    {
                                                                        i1 = ((flag) ? 1 : 0);
                                                                        if (!"GU".equals(s2))
                                                                        {
                                                                            i1 = ((flag) ? 1 : 0);
                                                                            if (!"KN".equals(s2))
                                                                            {
                                                                                i1 = ((flag) ? 1 : 0);
                                                                                if (!"KY".equals(s2))
                                                                                {
                                                                                    i1 = ((flag) ? 1 : 0);
                                                                                    if (!"LC".equals(s2))
                                                                                    {
                                                                                        i1 = ((flag) ? 1 : 0);
                                                                                        if (!"MP".equals(s2))
                                                                                        {
                                                                                            i1 = ((flag) ? 1 : 0);
                                                                                            if (!"MS".equals(s2))
                                                                                            {
                                                                                                i1 = ((flag) ? 1 : 0);
                                                                                                if (!"PR".equals(s2))
                                                                                                {
                                                                                                    i1 = ((flag) ? 1 : 0);
                                                                                                    if (!"SX".equals(s2))
                                                                                                    {
                                                                                                        i1 = ((flag) ? 1 : 0);
                                                                                                        if (!"TC".equals(s2))
                                                                                                        {
                                                                                                            i1 = ((flag) ? 1 : 0);
                                                                                                            if (!"TT".equals(s2))
                                                                                                            {
                                                                                                                i1 = ((flag) ? 1 : 0);
                                                                                                                if (!"US".equals(s2))
                                                                                                                {
                                                                                                                    i1 = ((flag) ? 1 : 0);
                                                                                                                    if (!"VC".equals(s2))
                                                                                                                    {
                                                                                                                        i1 = ((flag) ? 1 : 0);
                                                                                                                        if (!"VG".equals(s2))
                                                                                                                        {
                                                                                                                            if ("VI".equals(s2))
                                                                                                                            {
                                                                                                                                i1 = ((flag) ? 1 : 0);
                                                                                                                            } else
                                                                                                                            {
                                                                                                                                i1 = 0;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i1 == 0)
                        {
                            break label0;
                        }
                        obj = ((String) (obj)).substring(0, 3);
                    }
                    s2 = s1;
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj = String.valueOf(obj);
                        s2 = String.valueOf(s1);
                        if (s2.length() != 0)
                        {
                            obj = ((String) (obj)).concat(s2);
                        } else
                        {
                            obj = new String(((String) (obj)));
                        }
                        if (eey.g(((String) (obj))) == null)
                        {
                            obj = String.valueOf(g.u(((String) (obj))));
                            if (((String) (obj)).length() != 0)
                            {
                                obj = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ".concat(((String) (obj)));
                            } else
                            {
                                obj = new String("TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, invalid number ");
                            }
                            eev.e("Babel_telephony", ((String) (obj)));
                            s2 = s1;
                        } else
                        {
                            s1 = String.valueOf(g.u(((String) (obj))));
                            if (s1.length() != 0)
                            {
                                s1 = "TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ".concat(s1);
                            } else
                            {
                                s1 = new String("TelePhoneNumber.maybeAddAreaCodeToPhoneNumber, added area code to: ");
                            }
                            eev.e("Babel_telephony", s1);
                            s2 = ((String) (obj));
                        }
                    }
                }
                obj = b(s2);
            }
            s1 = ((String) (obj));
            if (q())
            {
                s2 = eey.d(((String) (obj)));
                s1 = ((String) (obj));
                if (s2 != null)
                {
                    s1 = s2;
                }
            }
            return s1;
        }
        obj = null;
        break MISSING_BLOCK_LABEL_626;
    }

    String f()
    {
        String s = e();
        if (s != null)
        {
            return eey.g(s);
        } else
        {
            return null;
        }
    }

    String g()
    {
        return PhoneNumberUtils.extractPostDialPortion(c());
    }

    ConnectionRequest h()
    {
        return b;
    }

    ConnectionRequest i()
    {
        Object obj = e();
        if (obj != null && !((String) (obj)).equals(c()))
        {
            obj = Uri.fromParts("tel", ((String) (obj)), null);
            return new ConnectionRequest(b.getAccountHandle(), ((Uri) (obj)), b.getExtras());
        } else
        {
            return b;
        }
    }

    TeleConnectionService j()
    {
        return a;
    }

    boolean k()
    {
        return c;
    }

    boolean l()
    {
        String s = e();
        return s != null && eey.g(s) != null;
    }

    boolean m()
    {
        Object obj = b;
        if (obj == null)
        {
            return false;
        }
        if (((ConnectionRequest) (obj)).getExtras() == null)
        {
            eev.e("Babel_telephony", "TeleUtils.isGoogleVoiceRequest, no extras");
            return false;
        }
        String s = ((ConnectionRequest) (obj)).getExtras().getString("android.telecom.extra.GATEWAY_PROVIDER_PACKAGE");
        obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            obj = "TeleUtils.isGoogleVoiceRequest, gatewayProviderPackage: ".concat(((String) (obj)));
        } else
        {
            obj = new String("TeleUtils.isGoogleVoiceRequest, gatewayProviderPackage: ");
        }
        eev.e("Babel_telephony", ((String) (obj)));
        return TextUtils.equals("com.google.android.apps.googlevoice", s);
    }

    boolean n()
    {
        Uri uri = b.getAddress();
        if (uri != null && "voicemail".equals(uri.getScheme()))
        {
            return true;
        } else
        {
            return g.d(((TelephonyManager)a.getSystemService("phone")).getVoiceMailNumber(), e());
        }
    }

    boolean o()
    {
        return g;
    }

    boolean p()
    {
        return a(true);
    }

    boolean q()
    {
        if (!g.a(a, "babel_telephony_allow_fallback_to_anonymous_calling", true))
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, disabled by gservices");
            return false;
        }
        String s1 = d.b();
        if (!TextUtils.isEmpty(s1))
        {
            String s = String.valueOf("babel_telephony_allow_fallback_to_anonymous_calling");
            String s2 = String.valueOf(String.format(Locale.US, "_carrier_%s", new Object[] {
                s1
            }));
            if (s2.length() != 0)
            {
                s = s.concat(s2);
            } else
            {
                s = new String(s);
            }
            if (!g.a(a, s, true))
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "TelePhoneNumber.shouldAnonymizeCall, disabled by gservices for carrier: ".concat(s);
                } else
                {
                    s = new String("TelePhoneNumber.shouldAnonymizeCall, disabled by gservices for carrier: ");
                }
                eev.e("Babel_telephony", s);
                return false;
            }
        }
        if (!a(false))
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, doesn't need proxy number");
            return false;
        }
        if (e != null)
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, has proxy number");
            return false;
        }
        if (d.c() == 2)
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, on light profile");
            return false;
        } else
        {
            eev.e("Babel_telephony", "TelePhoneNumber.shouldAnonymizeCall, returning true");
            return true;
        }
    }
}
