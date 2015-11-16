// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import h;
import htg;
import hth;
import hti;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l;

// Referenced classes of package com.google.api.client.http:
//            UrlEncodedParser

public class GenericUrl extends GenericData
{

    private static final hth URI_FRAGMENT_ESCAPER = new hti("=&-_.!~*'()@:$,;/?:", false);
    private String fragment;
    private String host;
    private List pathParts;
    private int port;
    private String scheme;
    private String userInfo;

    public GenericUrl()
    {
        port = -1;
    }

    public GenericUrl(String s)
    {
        this(parseURL(s));
    }

    private GenericUrl(String s, String s1, int i, String s2, String s3, String s4, String s5)
    {
        Object obj = null;
        super();
        port = -1;
        scheme = s.toLowerCase();
        host = s1;
        port = i;
        pathParts = toPathParts(s2);
        if (s3 != null)
        {
            s = htg.b(s3);
        } else
        {
            s = null;
        }
        fragment = s;
        if (s4 != null)
        {
            UrlEncodedParser.parse(s4, this);
        }
        s = obj;
        if (s5 != null)
        {
            s = htg.b(s5);
        }
        userInfo = s;
    }

    public GenericUrl(URI uri)
    {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo());
    }

    public GenericUrl(URL url)
    {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    static void addQueryParams(Set set1, StringBuilder stringbuilder)
    {
        set1 = set1.iterator();
        boolean flag = true;
        do
        {
            if (!set1.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)set1.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            if (obj != null)
            {
                obj1 = htg.f((String)((java.util.Map.Entry) (obj1)).getKey());
                if (obj instanceof Collection)
                {
                    obj = ((Collection)obj).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        flag = appendParam(flag, stringbuilder, ((String) (obj1)), ((Iterator) (obj)).next());
                    }
                } else
                {
                    flag = appendParam(flag, stringbuilder, ((String) (obj1)), obj);
                }
            }
        } while (true);
    }

    private static boolean appendParam(boolean flag, StringBuilder stringbuilder, String s, Object obj)
    {
        if (flag)
        {
            flag = false;
            stringbuilder.append('?');
        } else
        {
            stringbuilder.append('&');
        }
        stringbuilder.append(s);
        s = htg.f(obj.toString());
        if (s.length() != 0)
        {
            stringbuilder.append('=').append(s);
        }
        return flag;
    }

    private void appendRawPathFromParts(StringBuilder stringbuilder)
    {
        int j = pathParts.size();
        for (int i = 0; i < j; i++)
        {
            String s = (String)pathParts.get(i);
            if (i != 0)
            {
                stringbuilder.append('/');
            }
            if (s.length() != 0)
            {
                stringbuilder.append(htg.c(s));
            }
        }

    }

    private static URL parseURL(String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static List toPathParts(String s)
    {
        if (s == null || s.length() == 0)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        boolean flag = true;
        int i = 0;
        while (flag) 
        {
            int j = s.indexOf('/', i);
            String s1;
            if (j != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                s1 = s.substring(i, j);
            } else
            {
                s1 = s.substring(i);
            }
            arraylist.add(htg.b(s1));
            i = j + 1;
        }
        return arraylist;
    }

    private static URI toURI(String s)
    {
        try
        {
            s = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public void appendRawPath(String s)
    {
        List list;
label0:
        {
            if (s != null && s.length() != 0)
            {
                list = toPathParts(s);
                if (pathParts != null && !pathParts.isEmpty())
                {
                    break label0;
                }
                pathParts = list;
            }
            return;
        }
        int i = pathParts.size();
        List list1 = pathParts;
        s = String.valueOf((String)pathParts.get(i - 1));
        String s1 = String.valueOf((String)list.get(0));
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        list1.set(i - 1, s);
        pathParts.addAll(list.subList(1, list.size()));
    }

    public final String build()
    {
        String s = String.valueOf(buildAuthority());
        String s1 = String.valueOf(buildRelativeUrl());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public final String buildAuthority()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((String)h.a(scheme));
        stringbuilder.append("://");
        if (userInfo != null)
        {
            stringbuilder.append(htg.e(userInfo)).append('@');
        }
        stringbuilder.append((String)h.a(host));
        int i = port;
        if (i != -1)
        {
            stringbuilder.append(':').append(i);
        }
        return stringbuilder.toString();
    }

    public final String buildRelativeUrl()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (pathParts != null)
        {
            appendRawPathFromParts(stringbuilder);
        }
        addQueryParams(entrySet(), stringbuilder);
        String s = fragment;
        if (s != null)
        {
            stringbuilder.append('#').append(URI_FRAGMENT_ESCAPER.a(s));
        }
        return stringbuilder.toString();
    }

    public GenericUrl clone()
    {
        GenericUrl genericurl = (GenericUrl)super.clone();
        if (pathParts != null)
        {
            genericurl.pathParts = new ArrayList(pathParts);
        }
        return genericurl;
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof GenericUrl))
        {
            return false;
        } else
        {
            obj = (GenericUrl)obj;
            return build().equals(((GenericUrl) (obj)).toString());
        }
    }

    public Collection getAll(String s)
    {
        s = ((String) (get(s)));
        if (s == null)
        {
            return Collections.emptySet();
        }
        if (s instanceof Collection)
        {
            return Collections.unmodifiableCollection((Collection)s);
        } else
        {
            return Collections.singleton(s);
        }
    }

    public Object getFirst(String s)
    {
label0:
        {
            Object obj = get(s);
            s = ((String) (obj));
            if (obj instanceof Collection)
            {
                s = ((Collection)obj).iterator();
                if (!s.hasNext())
                {
                    break label0;
                }
                s = ((String) (s.next()));
            }
            return s;
        }
        return null;
    }

    public String getFragment()
    {
        return fragment;
    }

    public String getHost()
    {
        return host;
    }

    public List getPathParts()
    {
        return pathParts;
    }

    public int getPort()
    {
        return port;
    }

    public String getRawPath()
    {
        if (pathParts == null)
        {
            return null;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            appendRawPathFromParts(stringbuilder);
            return stringbuilder.toString();
        }
    }

    public final String getScheme()
    {
        return scheme;
    }

    public final String getUserInfo()
    {
        return userInfo;
    }

    public int hashCode()
    {
        return build().hashCode();
    }

    public GenericUrl set(String s, Object obj)
    {
        return (GenericUrl)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public final void setFragment(String s)
    {
        fragment = s;
    }

    public final void setHost(String s)
    {
        host = (String)h.a(s);
    }

    public void setPathParts(List list)
    {
        pathParts = list;
    }

    public final void setPort(int i)
    {
        boolean flag;
        if (i >= -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "expected port >= -1");
        port = i;
    }

    public void setRawPath(String s)
    {
        pathParts = toPathParts(s);
    }

    public final void setScheme(String s)
    {
        scheme = (String)h.a(s);
    }

    public final void setUserInfo(String s)
    {
        userInfo = s;
    }

    public String toString()
    {
        return build();
    }

    public final URI toURI()
    {
        return toURI(build());
    }

    public final URL toURL()
    {
        return parseURL(build());
    }

    public final URL toURL(String s)
    {
        try
        {
            s = new URL(toURL(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

}
