// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

abstract class CronetOutputStream extends OutputStream
    implements UploadDataProvider
{

    CronetOutputStream()
    {
    }

    abstract void b();

    abstract void c();
}
