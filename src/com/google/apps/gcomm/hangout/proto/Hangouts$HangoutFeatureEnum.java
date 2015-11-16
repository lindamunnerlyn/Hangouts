// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kog;
import koj;
import kon;
import kop;

public final class clear extends koj
{

    private static volatile mergeFrom _emptyArray[];

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kon.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kog kog1)
    {
        return (new <init>()).mergeFrom(kog1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kop.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public cachedSize mergeFrom(kog kog1)
    {
_L3:
        int i = kog1.a();
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 33;
           goto _L1 _L2
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L3; else goto _L2
_L2:
        return this;
    }

    public volatile kop mergeFrom(kog kog1)
    {
        return mergeFrom(kog1);
    }

    public ()
    {
        clear();
    }
}
