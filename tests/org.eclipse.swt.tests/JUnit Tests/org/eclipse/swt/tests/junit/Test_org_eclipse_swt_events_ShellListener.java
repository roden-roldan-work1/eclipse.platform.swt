package org.eclipse.swt.tests.junit;

/*
 * (c) Copyright IBM Corp. 2000, 2002. All rights reserved.
 * This file is made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 */

import org.eclipse.swt.events.*;
import junit.framework.*;
import junit.textui.*;

/**
 * Automated Test Suite for class org.eclipse.swt.events.ShellListener
 *
 * @see org.eclipse.swt.events.ShellListener
 */
public class Test_org_eclipse_swt_events_ShellListener extends SwtTestCase {

public Test_org_eclipse_swt_events_ShellListener(String name) {
	super(name);
}


protected void setUp() {
}

protected void tearDown() {
}

public void test_shellActivatedLorg_eclipse_swt_events_ShellEvent() {
	warnUnimpl("Test test_shellActivatedLorg_eclipse_swt_events_ShellEvent not written");
}

public void test_shellClosedLorg_eclipse_swt_events_ShellEvent() {
	warnUnimpl("Test test_shellClosedLorg_eclipse_swt_events_ShellEvent not written");
}

public void test_shellDeactivatedLorg_eclipse_swt_events_ShellEvent() {
	warnUnimpl("Test test_shellDeactivatedLorg_eclipse_swt_events_ShellEvent not written");
}

public void test_shellDeiconifiedLorg_eclipse_swt_events_ShellEvent() {
	warnUnimpl("Test test_shellDeiconifiedLorg_eclipse_swt_events_ShellEvent not written");
}

public void test_shellIconifiedLorg_eclipse_swt_events_ShellEvent() {
	warnUnimpl("Test test_shellIconifiedLorg_eclipse_swt_events_ShellEvent not written");
}

public static java.util.Vector methodNames() {
	java.util.Vector methodNames = new java.util.Vector();
	methodNames.addElement("test_shellActivatedLorg_eclipse_swt_events_ShellEvent");
	methodNames.addElement("test_shellClosedLorg_eclipse_swt_events_ShellEvent");
	methodNames.addElement("test_shellDeactivatedLorg_eclipse_swt_events_ShellEvent");
	methodNames.addElement("test_shellDeiconifiedLorg_eclipse_swt_events_ShellEvent");
	methodNames.addElement("test_shellIconifiedLorg_eclipse_swt_events_ShellEvent");
	return methodNames;
}
protected void runTest() throws Throwable {
	if (getName().equals("test_shellActivatedLorg_eclipse_swt_events_ShellEvent")) test_shellActivatedLorg_eclipse_swt_events_ShellEvent();
	else if (getName().equals("test_shellClosedLorg_eclipse_swt_events_ShellEvent")) test_shellClosedLorg_eclipse_swt_events_ShellEvent();
	else if (getName().equals("test_shellDeactivatedLorg_eclipse_swt_events_ShellEvent")) test_shellDeactivatedLorg_eclipse_swt_events_ShellEvent();
	else if (getName().equals("test_shellDeiconifiedLorg_eclipse_swt_events_ShellEvent")) test_shellDeiconifiedLorg_eclipse_swt_events_ShellEvent();
	else if (getName().equals("test_shellIconifiedLorg_eclipse_swt_events_ShellEvent")) test_shellIconifiedLorg_eclipse_swt_events_ShellEvent();
}
}
